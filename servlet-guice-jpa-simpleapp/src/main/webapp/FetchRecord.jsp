<%@page import="com.entity.StudentDetail"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Records</title>

<style>
table {
	width: 100%;
}

table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 15px;
	text-align: left;
}

table#t01 tr:nth-child(even) {
	background-color: #eee;
}

table#t01 tr:nth-child(odd) {
	background-color: #fff;
}

table#t01 th {
	background-color: black;
	color: white;
}
</style>

</head>
<body>
	<h1 style="text-align: center;">All Student Records</h1>
	<table id="t01">
		<tr>
			<th>Student Id</th>
			<th>Student Name</th>
			<th>Department</th>
			<th>Contact No.</th>
			<th>Email-Id</th>
			<th>Address</th>
		</tr>
		<%
		  List<StudentDetail> posts = (List<StudentDetail>) request.getAttribute("myname");
		  for (StudentDetail post : posts) {
		%>
		<tr>
			<td><%=post.getsId()%></td>
			<td><%=post.getsName()%></td>
			<td><%=post.getsDepartment()%></td>
			<td><%=post.getsContact()%></td>
			<td><%=post.getsEmail()%></td>
			<td><%=post.getsAddress()%></td>
		</tr>
		<%}%>
	</table>

</body>
</html>