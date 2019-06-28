
<%@page import="com.axelor.db.AddressBook"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Student Record</title>
</head>
<body>
	<h1 style="text-align: center">Student Record Search Form</h1>
	<br>
	<br>
	<br>

	<%
	  AddressBook post = (AddressBook) request.getAttribute("searchrecord");
	  // StudentDetail post = (StudentDetail) posts;
	%>

	<form name="updateForm" method="post" action="update">
		<span style="display: inline-block; width: 10%;"></span> Person Name: <span
			style="display: inline-block; width: 8%;"></span> <input type="text" size="50" name="perName"
			value="<%=post.getPerName()%>" /><input type="hidden" name="perId" value="<%=post.getPerId()%>" />
		<br /> <br /> <span style="display: inline-block; width: 10%;"></span> Person Name: <span
			style="display: inline-block; width: 8%;"></span> <input type="text" size="50" name="perName"
			value="<%=post.getPerName()%>" /><br /> <br /> <span
			style="display: inline-block; width: 14%;"></span> City: <span
			style="display: inline-block; width: 10%;"></span> <select name="perCity">
			<option value="default">----Select City----</option>
			<option value="Mumbai">Mumbai</option>
			<option value="Pune">Pune</option>
			<option value="Surat">Surat</option>
			<option value="Rajkot">Rajkot</option>
		</select> <br /> <br /> <span style="display: inline-block; width: 10%;"></span> <br /> <br /> <br />
		<br /> <span style="display: inline-block; width: 30%;"></span> <input type="submit"
			name="action" value="Update" /> <span style="display: inline-block; width: 3%;"></span> <input
			type="reset" value="Reset" />
	</form>

</body>
</html>