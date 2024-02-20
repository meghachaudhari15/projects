<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <div id="divv">
     <form action="add_employee" method="get">
       <table border="1px solid">
         <tr>
           <td>name</td>
           <td>
             <input type="text" name="name">
           </td>
         </tr>
         <tr>
           <td>email</td>
           <td>
             <input type="email" name="email">
           </td>
         </tr>
         <tr>
           <td>mobile</td>
           <td>
             <input type="text" name="mobile">
           </td>
         </tr>
         <tr>
           <td>age</td>
           <td>
             <input type="text" name="age">
           </td>
         </tr>
       </table>
       <input type="submit" value="submit">
     </form>
  </div>
</body>
</html>