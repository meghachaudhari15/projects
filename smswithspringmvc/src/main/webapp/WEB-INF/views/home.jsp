<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body {
	font-family: Arial, sans-serif;
	background-color: rgb(40, 11, 66);
	margin: 0;
	padding: 0;
}

nav {
	background-color: #333;
	padding: 10px 0;
	text-align: center;
}

nav a {
	color: #fff;
	padding: 14px 20px;
	text-decoration: none;
	display: inline-block;
	transition: background-color 0.3s;
}

nav a:hover {
	background-color: #555;
	box-shadow: 0px 0px 20px black;
}

div[align="center"] {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

h1 {
	color: #007bff;
}
</style>
</head>
<body>
	<nav>
		<a href="home">HOME</a> <a href="add_student">ADD</a> <a
			href="edit_student">EDIT</a> <a href="delete_student">DELETE</a> <a
			href="search">SEARCH_BY_NAME</a>
			<a href="student_id">SEARCH_BY_ID</a>
			<a href="search_age">SEARCH_BY_AGE</a>
			<a href="search_em">SEARCH_BY_EMAIL</a>
			<a href="get_students">ALL STUDENTS</a>
			<a href="log_out">LOG OUT</a>
	</nav>
	<%
	String message = (String) request.getAttribute("message");
	if (message != null && (message.equals("Logged in") || message.equals("Invalid Email or Password"))) {
	%>
	<div align="center">
		<h1><%=message%></h1>
	</div>
	<%
	}
	%>
</body>
</html>