<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Videos</title>
</head>
<body>
	<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	response.setHeader("Pragma", "no-cache"); // HTTP 1.0=<
	response.setHeader("Expires", "0"); // proxies
	
	if (session.getAttribute("username") == null) {
		response.sendRedirect("login.jsp");
	}
	%>

	https://www.youtube.com/watch?v=Ww5u5UAWIts
</body>
</html>