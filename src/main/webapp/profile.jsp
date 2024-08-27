<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
</head>
<body>
	<%
	String url = "jdbc:mysql://localhost:3306/aryan";
	String userName = "root";
	String password = "1234";
	String query = "select * from student where rollno=102";
	Class.forName("com.mysql.jdbc.Driver");
	Connection connection = DriverManager.getConnection(url, userName, password);
	Statement statement = connection.createStatement();
	ResultSet set = statement.executeQuery(query);
	set.next();
	%>
	Roll No. :<%=set.getInt(1)%>
	<br>Name :
	<%=set.getString(2)%>
	<br>Marks :<%=set.getInt(3)%>
</body>
</html>