<%@page import="com.axelor.db.Mobile"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Contact</title>
</head>
<body>
	<h1 style="text-align: center">Person Record Update Form</h1>
	<br>
	<br>
	<br>

	<%
	  Mobile post = (Mobile) request.getAttribute("searchrecord");
	%>
	<label>Mobile Id: <%=post.getmId()%></label>
	<br>
	<br>
	<form name="updateForm" method="post" action="contact">
		<span style="display: inline-block; width: 10%;"></span> Person Contact: <span
			style="display: inline-block; width: 4%;"></span> <input type="text" size="50" name="addCon"
			value="<%=post.getContact()%>" /><input type="hidden" name="perId" value="<%=post.getmId()%>" />
		<br /> <br /> <span style="display: inline-block; width: 10%;"></span> Contact Type: <span
			style="display: inline-block; width: 8%;"></span> <input type="text" size="50" name="addConType"
			value="<%=post.getType()%>" /> <br /> <br /> <br /> <br /> <span
			style="display: inline-block; width: 30%;"></span> <input type="submit" name="action"
			value="Update" /> <span style="display: inline-block; width: 3%;"></span> <input type="reset"
			value="Reset" />
	</form>

</body>
</html>