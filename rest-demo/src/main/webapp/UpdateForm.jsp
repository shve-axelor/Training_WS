
<%@page import="com.axelor.db.AddressBook"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Person Record</title>
</head>
<body>
	<h1 style="text-align: center">Person Record Update Form</h1>
	<br>
	<br>
	<br>

	<%
	  AddressBook post = (AddressBook) request.getAttribute("searchrecord");
	%>
	<label>Person Id: <%=post.getPerId()%></label>
	<br>
	<br>
	<form name="updateForm" method="post" action="update">
		<span style="display: inline-block; width: 10%;"></span> Person Name: <span
			style="display: inline-block; width: 4%;"></span> <input type="text" size="50" name="perName"
			value="<%=post.getPerName()%>" /><input type="hidden" name="perId" value="<%=post.getPerId()%>" />
		<br /> <br /> <span style="display: inline-block; width: 10%;"></span> City: <span
			style="display: inline-block; width: 8%;"></span> <input type="text" size="50" name="perCity"
			value="<%=post.getPerCity()%>" /><br /> <br /> <span
			style="display: inline-block; width: 10%;"></span> State: <span
			style="display: inline-block; width: 8%;"></span> <input type="text" size="50" name="perState"
			value="<%=post.getPerState()%>" /> <br /> <br /> <span
			style="display: inline-block; width: 10%;"></span> Person Address: <span
			style="display: inline-block; width: 7%;"></span>
		<textarea name="perAddress" rows="5" cols="50"><%=post.getPerAddress()%></textarea>
		<br /> <br /> <br /> <br /> <span style="display: inline-block; width: 30%;"></span> <input
			type="submit" name="action" value="Update" /> <span style="display: inline-block; width: 3%;"></span>
		<input type="reset" value="Reset" />
	</form>

</body>
</html>