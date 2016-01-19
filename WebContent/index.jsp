<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is my first JSP</h1>
<h2>Let's try this</h2>


<form action="reg" method="post">
<table>
<tr>
<th>Film Name</th>
<td> <input type="text" name="film_name" /></td>
</tr>
<tr>
<th>Director Name</th>
<td> <input type="text" name="dir_name" /></td>
</tr>
<tr>
<th>Year</th>
<td> <input type="text" name="year" /></td>
</tr>
<tr>
<th></th>
<td> <input type="submit" value="Add" name="whattodo"/></td>
</tr>

<tr>
<th></th>
<td> <input type="submit" value="Go Back" name="whattodo" /></td>
</tr>

</table>


</form>


</body>
</html>