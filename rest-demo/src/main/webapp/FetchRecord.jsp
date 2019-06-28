
<%@page import="com.axelor.db.Address"%>
<%@page import="com.axelor.db.Mobile"%>
<%@page import="com.axelor.db.AddressBook"%>
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
	width: 80%;
	padding: 20px;
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
	<h1 style="text-align: center;">All Person Records</h1>
	<br />
	<h3 style="text-align: center;">AddressBook Table</h3>
		<table id="t01">
			<tr>
				<th>Person Id</th>
				<th>Person Name</th>
				<th>State</th>
				<th>City</th>
				<th>Add Contact</th>
				<th>Add Address</th>
			</tr>
			<%
			  List<AddressBook> posts = (List<AddressBook>) request.getAttribute("allrecord");
			  for (AddressBook post : posts) {
			%>
			<tr>
				<td><%=post.getPerId()%></td>
				<td><%=post.getPerName()%></td>
				<td><%=post.getPerState()%></td>
				<td><%=post.getPerCity()%></td>
				<td><a href="search/<%= post.getPerId()%>">Edit Record</a> </td>
				<td>add address</td>
			</tr>
			<%}%>
		</table>
	<br />
	<br />
	<h3 style="text-align: center;">Contact Table</h3>
	<table id="t01">
		<tr>
			<th>Mobile Id</th>
			<th>Contact No.</th>
			<th>Contact Type</th>
		</tr>
		<%
		  List<Mobile> mo = (List<Mobile>) request.getAttribute("allmobile");
		  for (Mobile post : mo) {
		%>
		<tr>
			<td><%=post.getmId()%></td>
			<td><%=post.getContact()%></td>
			<td><%=post.getType()%></td>
		</tr>
		<%}%>
	</table>

	<br />
	<br />
	<h3 style="text-align: center;">Address Table</h3>
	<table id="t01">
		<tr>
			<th>Address Id</th>
			<th>Address</th>
		</tr>
		<%
		  List<Address> add = (List<Address>) request.getAttribute("alladdress");
		  for (Address post : add) {
		%>
		<tr>
			<td><%=post.getaId()%></td>
			<td><%=post.getAddress()%></td>
		</tr>
		<%}%>
	</table>

</body>
</html>