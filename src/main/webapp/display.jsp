<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display</title>
</head>
<body>
	<%-- 	${name} --%>
	<br>
	<%-- 	<j:import url="https://www.telusko.com/"></j:import> --%>
	<%-- 	<j:out value="${student }" /> --%>
	<j:forEach items="${students }" var="s">
	${s.name }<br>
	</j:forEach>
</body>
</html>