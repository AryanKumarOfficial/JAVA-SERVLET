<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="ms" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SQL Tags</title>
</head>
<body>

	<ms:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/mario" user="root" password="1234" />
	<ms:query var="rs" dataSource="${db }">
	select * from gadgets
	</ms:query>
	<c:forEach items="${rs.rows }" var="gadget">
		<c:out value="${gadget.gid }"></c:out> : 
		<c:out value="${gadget.gname }"></c:out> : 
		<c:out value="${gadget.price }"></c:out><br>
	</c:forEach>

</body>
</html>