<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Session Schedule Details</title>

<style>
table {
	text-align: center;
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 15px;
}
</style>
</head>
<body>
<div align="center">
		<table border=1>
			<tr>
				<th>SessionName</th>
				<th>Duration(Days)</th>
				<th>Faculty</th>
				<th>Mode</th>
				<th></th>
			</tr>
			<c:forEach items="${sessionlist}" var="list">
				<tr>
					<td>${list.name}</a></td>
					<td>${list.duration}</td>
					<td>${list.faculty}</td>
					<td>${list.mode}</td>
					<td><a modelattributle="name" href="enroll.do">enroll me</a></td>
				</tr>
			</c:forEach>
		</table>
		<br>
		
	</div>
</body>
</html>