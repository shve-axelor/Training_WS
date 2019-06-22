<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>

<body>
<h1 style="text-align:center">Student Registration Form</h1>
<br>
<br>
<br>
<form name="registrationForm" method="post" action="StudentDatabaseServlet">
	<span style="display:inline-block; width: 10%;"></span> 
		Student Name: 
	<span style="display:inline-block; width: 8%;"></span> 
		<input type="text" size="50" name="sName"/> 
		
		<br/> <br/>
	
	<span style="display:inline-block; width: 10%;"></span> 
		Student Email: 
	<span style="display:inline-block; width: 8%;"></span> 
		<input type="text" size="50" name="sEmail"/> 
		
		<br/> <br/>
	<span style="display:inline-block; width: 10%;"></span> 
		Student Contact No: 
	<span style="display:inline-block; width: 5%;"></span> 
		<input type="text" size="50" name="sContact"/> 
		
		<br/> <br/>
	<span style="display:inline-block; width: 10%;"></span> 
		Student Department: 
	<span style="display:inline-block; width: 5%;"></span> 
		<select name="sDepartment">
			<option value="default">----Select Department----</option>
  			<option value="Computer Science">Computer Science</option>
  			<option value="Civil">Civil</option>
  			<option value="Electronics">Electronics</option>
 			<option value="Textile">Textile</option>
		</select>
		
		<br/> <br/>
	<span style="display:inline-block; width: 10%;"></span> 
		Student Address: 
	<span style="display:inline-block; width: 7%;"></span> 
		<textarea name="sAddress" rows="5" cols="50"></textarea>
		
		<br/> <br/>
		<br/> <br/>
		
	<span style="display:inline-block; width: 30%;"></span>  
    	<input type="submit" name="action" value="Register" />
    <span style="display:inline-block; width: 3%;"></span>
    	<input type="reset" value="Reset" />
</form>


</body>
</html>