<%@page import="java.util.Iterator"%>
<%@page import="com.axelor.db.Mobile"%>
<%@page import="com.axelor.db.AddressBook"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Person Records</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
table {
	width: 100%;
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
	<h1 style="text-align: center;">Person Records</h1>
	<br />
	<h3 style="text-align: center;">AddressBook Table</h3>
	<table id="t01">
		<tr>
			<th>Person Id</th>
			<th>Person Name</th>
			<th>State</th>
			<th>City</th>
			<th>Address</th>
			<th>Add Contact</th>
			<th>Edit Record</th>
			<th>Delete Record</th>
			<th>Mobile Id</th>
			<th>Contact No.</th>
			<th>Contact Type</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<%
		  List<AddressBook> posts = (List<AddressBook>) request.getAttribute("allrecord");
		  Iterator<AddressBook> i2 = posts.iterator();
		  while (i2.hasNext()) {
		    AddressBook post = i2.next();
		    List<Mobile> m1 = post.getMobile_numbers();
		    Iterator<Mobile> i1 = m1.iterator();
		%>

		<% 
		    if (m1.size() == 0) {
		%>
		<tr>
			<td rowspan="1"><%=post.getPerId()%></td>
			<td rowspan="1"><%=post.getPerName()%></td>
			<td rowspan="1"><%=post.getPerState()%></td>
			<td rowspan="1"><%=post.getPerCity()%></td>
			<td rowspan="1"><%=post.getPerAddress()%></td>
			<td rowspan="1"><a href="addcon/<%=post.getPerId()%>">Add Contact</a></td>
			<td rowspan="1"><a href="search/<%=post.getPerId()%>">Edit Record</a></td>
			<td rowspan="1"><a href="delete/<%=post.getPerId()%>">Delete Record</a></td>
			<td>empty</td>
			<td>empty</td>
			<td>empty</td>
			<td>empty</td>
			<td>empty</td>
		</tr>
		<%
			  } else { %>
		<tr>
			<td rowspan="<%=m1.size()%>"><%=post.getPerId()%></td>
			<td rowspan="<%=m1.size()%>"><%=post.getPerName()%></td>
			<td rowspan="<%=m1.size()%>"><%=post.getPerState()%></td>
			<td rowspan="<%=m1.size()%>"><%=post.getPerCity()%></td>
			<td rowspan="<%=m1.size()%>"><%=post.getPerAddress()%></td>
			<td rowspan="<%=m1.size()%>"><a href="addcon/<%=post.getPerId()%>">Add Contact</a></td>
			<td rowspan="<%=m1.size()%>"><a href="search/<%=post.getPerId()%>">Edit Record</a></td>
			<td rowspan="<%=m1.size()%>"><a href="delete/<%=post.getPerId()%>">Delete Record</a></td>
			<%
			  while (i1.hasNext()) {
			        Mobile m = i1.next();
			%>
			<td><%=m.getmId()%></td>
			<td><%=m.getContact()%></td>
			<td><%=m.getType()%></td>
			<td><a href="updatecon/<%=m.getmId()%>">Update</a></td>
			<td><a href="del/<%=m.getmId()%>">Delete</a></td>
		</tr>
		<% } %>

		<%} %>

		<%}%>
	</table>
	<br>
	<br>
	<form action="index.jsp">
		<input type="submit" value="Click Here To Go To Main Page" />
	</form>
</body>
</html>