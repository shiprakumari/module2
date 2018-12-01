<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center" >
	 
		<h2>Hotel Details</h2>

		<table border="1">
			<tr>
				<th>hotelId</th>
				<th>hotelName</th>
				<th>hotelRating</th>
				<th>hotelRate</th>
				<th>roomAvailable</th>
				<th></th>
			</tr>
			<a:forEach var="hotel" items="${temp}">
				<tr>
					<td>${hotel.hotelId}</td>
					<td><a href="book?name=${hotel.hotelName}">${hotel.hotelName}</a></td>
					<td>${hotel.hotelRating}</td>
					<td>${hotel.hotelRate}</td>
					<td>${hotel.roomAvailable}</td>
				</tr>
				
			</a:forEach>

		</table>
		<table><tr>
				<td>click a hotel name to start booking</td>
				</tr></table>
	</div>
</body>
</html>