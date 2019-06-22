<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Student Record</title>
</head>
<body>
<h1 style="text-align:center">Student Record Delete Form</h1>
<br><br><br><br>
<form method="post" action="StudentDatabaseServlet">
	<span style="display:inline-block; width: 10%;"></span> 
	Enter The Name Of The Student:
	<span style="display:inline-block; width: 8%;"></span> 
	<input type="text" size="50" name = "delete" />
	
	<br><br>	<br><br>
	
	<span style="display:inline-block; width: 35%;"></span> 
	<input type="submit" name="action" value = "Delete" />
	<span style="display:inline-block; width: 5%;"></span> 
	<input type="reset" value = "Clear" />
</form>
</body>
</html>