<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Record Search</title>
</head>
<body>
<h1 style="text-align:center">Student Record Search Form</h1>
<br>
<br>
<br>

<form name = "search" method="post" action="StudentDatabaseServlet">
	<span style="display:inline-block; width: 10%;"></span> 
		Enter Student Name You Want To Update: 
	<span style="display:inline-block; width: 2%;"></span> 
		<input type="text" size="25" name="searchName"/> 
		<span style="display:inline-block; width: 4%;"></span> 
		<input type="submit" name="action"  value="Search" />
		<br/> <br/>
</form>
</body>
</html>