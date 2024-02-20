<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body {
	height:100vh;
	font-family: Arial, sans-serif;
	background-image:url("");
	background-size:cover;
	background-repeat:no-repeat;
	margin: 0;
	padding: 0;
	
	background-color: rgb(172, 126, 212);

}

div {
	margin-top: 100px;
}

table {
	width: 300px;
	border-collapse: collapse;
	background-color: #392467;
	border: 1px solid #ccc;
	color:white;
}
table:hover{
	box-shadow: :0px 0px 10px black;
}

td {
	padding: 10px;
	text-align: left;
}

input[type="text"], input[type="password"] {
	width: 100%;
	padding: 10px;
	box-sizing: border-box;
	border: 1px solid #ccc;
	border-radius: 4px;
	font-size: 16px;
}

input[type="submit"] {
	width: 100%;
	padding: 10px;
	background-color: black;
	border: none;
	border-radius: 4px;
	color: #fff;
	font-size: 16px;
	cursor: pointer;
	transition: background-color 0.3s;
}

input[type="submit"]:hover {
	background-color:;
	box-shadow: 0px 0px 10px black;
}

a {
	text-decoration: none;
	color: black;
	margin-top: none;
	display: block;
}

a:hover {
	text-decoration: underline;
	color:white;
	background-color: black;
}

div[align="center"] {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	height: auto;
}

h1 {
	margin-top: 20px;
}
#head{
   text-align: center;
   margin-top: 50px;
   font-size:50px;
   text-shadow: 0px 0px 10px grey;
}
</style>
</head>
<body>
    <h1 id="head">WELCOME TO STUDENT MANAGEMENT SYSTEM</h1>
	<div align="center">
		<form action="log_in" method="post">
			<table border="1px solid">
				<tr>
					<td>Email</td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="text" name="password"></td>
				</tr>
			</table>
			<input type="submit" value="LOG IN">
		</form>
	</div>
	<div align="center">
		<a href="add_admin">New user? Create account</a>
	</div>
	<%
	String message = (String) request.getAttribute("message");
	if (message != null) {
	%>
	<div align="center">
		<h1><%=message%></h1>
	</div>
	<%
	}
	%>
</body>
</html>