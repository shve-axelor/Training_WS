<%@page import="com.entity.StudentDetail"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Student Record</title>
</head>
<body>
<h1 style="text-align:center">Student Record Search Form</h1>
<br>
<br>
<br>

<%
  List<StudentDetail> posts=(List<StudentDetail>) request.getAttribute("my");
	//StudentDetail post = (StudentDetail) posts;
	 for (StudentDetail post: posts) { 
%>

<form name="registrationForm" method="post" action="StudentDatabaseServlet">
	<span style="display:inline-block; width: 10%;"></span> 
		Student Name: 
	<span style="display:inline-block; width: 8%;"></span> 
		<input type="text" size="50" name="sName" value="<%= post.getsName()  %>"/> 
		<input type="hidden" name="sId" value="<%= post.getsId() %>"/> 
		<br/> <br/>
	
	<span style="display:inline-block; width: 10%;"></span> 
		Student Email: 
	<span style="display:inline-block; width: 8%;"></span> 
		<input type="text" size="50" name="Email" value="<%= post.getsEmail() %>"/> 
		
		<br/> <br/>
	<span style="display:inline-block; width: 10%;"></span> 
		Student Contact No: 
	<span style="display:inline-block; width: 5%;"></span> 
		<input type="text" size="50" name="sContact" value="<%= post.getsContact() %>" /> 
		
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
		<textarea name="Address" rows="5" cols="50"><%= post.getsAddress() %></textarea>
		
		<br/> <br/>
		<br/><br/>
<%} %>		
	<span style="display:inline-block; width: 30%;"></span>  
    	<input type="submit" name="action" value="Update" />
    <span style="display:inline-block; width: 3%;"></span>
    	<input type="reset" value="Reset" />
</form>


</body>
</html>