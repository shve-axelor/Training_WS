<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>

<body>
	<h1 style="text-align: center">Person Contact Registration Form</h1>
	<br>
	<br>
	<br>
	<form name="registrationForm" method="post" action="insert">
		<span style="display: inline-block; width: 10%;"></span> Person Name: <span
			style="display: inline-block; width: 8%;"></span> <input type="text" size="50" name="perName" />
		<br /> <br /> <span style="display: inline-block; width: 8%;"></span>Person Contact No: <span
			style="display: inline-block; width: 8%;"></span> <input type="text" size="50" name="perContact" />
		<br /> <br /> <span style="display: inline-block; width: 12%;"></span>Contact Type: <span
			style="display: inline-block; width: 8%;"></span> <input type="text" size="50" name="perType" />
		<br /> <br /> <span style="display: inline-block; width: 14%;"></span> State: <span
			style="display: inline-block; width: 9%;"></span> <input type="text" size="50" name="perState" />
		<br /> <br /> <span style="display: inline-block; width: 14%;"></span> City: <span
			style="display: inline-block; width: 10%;"></span> <input type="text" size="50" name="perCity" />
		<br /> <br /> <span style="display: inline-block; width: 10%;"></span> Person Address: <span
			style="display: inline-block; width: 7%;"></span>
		<textarea name="perAddress" rows="5" cols="50"></textarea>

		<br /> <br /> <br /> <br /> <span style="display: inline-block; width: 30%;"></span> <input
			type="submit" name="action" value="Register" /> <span style="display: inline-block; width: 3%;"></span>
		<input type="reset" value="Reset" />
	</form>


</body>
</html>