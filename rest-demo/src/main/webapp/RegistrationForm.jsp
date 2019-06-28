<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>

<body>
	<h1 style="text-align: center">Student Registration Form</h1>
	<br>
	<br>
	<br>
	<form name="registrationForm" method="post" action="insert">
		<span style="display: inline-block; width: 10%;"></span> Person Name: <span
			style="display: inline-block; width: 8%;"></span> <input type="text" size="50" name="perName" />
		<br /> <br /> <span style="display: inline-block; width: 8%;"></span>Person Contact No: <span
			style="display: inline-block; width: 8%;"></span> <input type="text" size="50" name="perContact" />
			<br /> <br /> <span style="display: inline-block; width: 8%;"></span>Contact Type: <span
			style="display: inline-block; width: 8%;"></span> <input type="text" size="50" name="perType" />
		<br /> <br /> <span style="display: inline-block; width: 14%;"></span> State: <span
			style="display: inline-block; width: 9%;"></span> <select name="perState">
			<option value="default">----Select State----</option>
			<option value="Gujarat">Gujarat</option>
			<option value="Rajsthan">Rajsthan</option>
			<option value="Maharashtra">Maharashtra</option>
			<option value="Madhyapradesh">Madhyapradesh</option>
		</select> <br /> <br /> <span style="display: inline-block; width: 14%;"></span> City: <span
			style="display: inline-block; width: 10%;"></span> <select name="perCity">
			<option value="default">----Select City----</option>
			<option value="Mumbai">Mumbai</option>
			<option value="Pune">Pune</option>
			<option value="Surat">Surat</option>
			<option value="Rajkot">Rajkot</option>
		</select> <br /> <br /> <span style="display: inline-block; width: 10%;"></span> Person Address: <span
			style="display: inline-block; width: 7%;"></span>
		<textarea name="perAddress" rows="5" cols="50"></textarea>

		<br /> <br /> <br /> <br /> <span style="display: inline-block; width: 30%;"></span> <input
			type="submit" name="action" value="Register" /> <span style="display: inline-block; width: 3%;"></span>
		<input type="reset" value="Reset" />
	</form>


</body>
</html>