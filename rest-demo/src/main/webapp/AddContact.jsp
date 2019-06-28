<%@page import="com.axelor.db.AddressBook"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Contact</title>
</head>
<body>
	<h1 style="text-align: center">Add Contact Form</h1>
	<br>
	<br>
	<br>
	<% AddressBook post = (AddressBook) request.getAttribute("searchrecord"); %>
	<label>Name: <%=post.getPerName()%></label>
	<br>
	<br>
	<label>City: <%=post.getPerCity()%></label>
	<br>
	<br>
	<label>Sate: <%=post.getPerState()%></label>
	<br>
	<br>
	<br>
	<br>
	<br>
	<form name="search" method="post" action="addcontact">
		Enter Contact Number: <span style="display: inline-block; width: 2%;"></span> <input type="text"
			size="25" name="addCon" /><br> <br> Enter Contact Type: <span
			style="display: inline-block; width: 2%;"></span> <input type="hidden" name="perId" value="<%=post.getPerId()%>"/><input type="text" size="25" name="addConType" /><br>
		<br> <input type="submit" name="action" value="Add" /> <br /> <br />
	</form>
</body>
</html>