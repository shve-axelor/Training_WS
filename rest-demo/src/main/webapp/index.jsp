<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Data Portal</title>
</head>

<h1 style="text-align: center">Student Database Portal</h1>
<body>
	<br>
	<br>
	<br>
	<form style="text-align: center" method="post" action="RegistrationForm.jsp">
		<input type="submit" value="Click Here To Insert New Data" />
	</form>
	<br>
	<br>
	<form style="text-align: center" method="post" action="fetch">
		<input type="submit" name="action" value="Click Here To See All Data" />
	</form>
	<br>
	<br>
	<form style="text-align: center" method="post" action="SearchForm.jsp">
		<input type="submit" value="Click Here To Update Record" />
	</form>
	<br>
	<br>
	<form style="text-align: center" method="post" action="DeleteForm.jsp">
		<input type="submit" value="Click Here To Delete Record" />
	</form>
</body>
</html>