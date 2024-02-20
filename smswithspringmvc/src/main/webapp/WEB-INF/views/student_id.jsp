<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List"%>
    <jsp:include page="home.jsp"></jsp:include>
 <%@page import="com.jspiders.smswithspringmvc.pojo.StudentPOJO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
 body {
	font-family: Arial, sans-serif;
	background-color: blueviolet;
	margin: 0;
	padding: 0;
}

div {
	margin-top: 50px;
}

table {
	width: 80%;
	border-collapse: collapse;
	background-color: #fff;
	border: 1px solid #ccc;
	margin-bottom: 20px;
}

th, td {
	padding: 10px;
	text-align: left;
}

th {
	background-color: #FF90BC;
	color: black;
}

tr:nth-child(even) {
	background-color: #f2f2f2; /* Alternate row color */
}

div[align="center"] {
	display: flex;
	justify-content: center;
	align-items: center;
	height: auto;
}

input[type="text"] {
	width: 100%;
	padding: 8px;
	box-sizing: border-box;
	border: 1px solid black;
	border-radius: 4px;
	font-size: 16px;
}

input[type="submit"] {
	width: 100%;
	padding: 10px;
	background-color: rgb(87, 35, 136);
	border: none;
	border-radius: 4px;
	color: #fff;
	font-size: 16px;
	cursor: pointer;
	transition: background-color 0.3s;
}

input[type="submit"]:hover {
	background-color: rgb(44, 15, 71);
}

h1 {
	color: rgb(44, 15, 71);
}


</style>
</head>
<body>
    <div align="center">
      <form action="student_id" method="post">
         <table border="1px solid">
            <tr>
              <td>ENTER ID</td>
              <td><input type="text"  name="id"></td>
            </tr>
         </table>
         <input type="submit" value="SEARCH">
      </form>
    <%
	StudentPOJO student = (StudentPOJO) request.getAttribute("student");
	if (student != null) {
	%>	<div align="center">
		<table border="1px solid">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Email</th>
				<th>Mobile</th>
				<th>Age</th>
			</tr>
			
			<tr>
				<td><%=student.getId()%></td>
				<td><%=student.getName()%></td>
				<td><%=student.getEmail()%></td>
				<td><%=student.getMobile()%></td>
				<td><%=student.getAge()%></td>
			</tr>
			
		</table>
	</div>
	<%
	} else {
	%>
	<div align="center">
		<h1>Students not found.</h1>
	</div>
	<%
	}
	%>
		
    </div>
</body>
</html>