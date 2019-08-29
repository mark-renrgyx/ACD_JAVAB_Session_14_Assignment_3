<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!--  For Assignment 14-3 -->
<html>
<head>
<meta charset="UTF-8">
<title>Currency Convertor</title>
</head>
<body>
<%
request.getRequestDispatcher("Converter").forward(request, response); 
%>

<!--  This was before the super-sexy way (the assignment said put all this is the doGet)
<h1>Calculator for you!</h1>
<form action="Converter" method="post">
<input type="radio" name="operation" value="add">Add <br />
<input type="radio" name="operation" value="multiply">Multiply <br />
<input type="text" name="first_number">
<input type="text" name="second_number">
<input type="submit" value="Calculate the numbers!!">
</form>
 -->

</body>
</html>