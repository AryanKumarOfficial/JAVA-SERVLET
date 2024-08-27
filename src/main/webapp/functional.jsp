<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Functional Tags in JSTL</title>
</head>
<body>
	<c:set var="str" value="honesty is best policy!" />

	<%-- 	Length : ${fn:length(str)} --%>
	<c:forEach items="${fn:split(str,' ') }" var="s">
		${s}
		<br>
	</c:forEach>
	<!-- 	index : ${fn:indexOf(str,"is")} -->
	<!-- 	IS THERE : ${fn:contains(str,"best")} -->


	<c:if test="${fn:contains(str,'honesty')}">

		<b>${fn:toUpperCase('Honesty')}</b> still exists!
		
	</c:if>


</body>
</html>