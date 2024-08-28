<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<%
	if (session.getAttribute("username") != null) {
		response.sendRedirect("welcome.jsp");
	}
	%>
	<form action="login" method="post">
		<div>
			Enter username : <input type="text" name="uname" />
		</div>
		<br>
		<div>
			Enter password : <input type="password" name="pass" />
		</div>
		<br>
		<div>
			<input type="submit" value="Login" />
		</div>
	</form>
</body>
</html>