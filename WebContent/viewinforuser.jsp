<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Information User</title>
</head>
<body>
	<c:set var="lstInfor" value="${sessionScope.lstInforUser}" />
	<h2>List of Information User</h2>
	<table border="1">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Address</td>
			<td>Phone</td>
		</tr>
		<c:forEach var="inforu" items="${lstInfor}">
			<tr>
				<td><c:out value="${inforu.id}" /></td>
				<td><c:out value="${inforu.name}" /></td>
				<td><c:out value="${inforu.address}" /></td>
				<td><c:out value="${inforu.phone}" /></td>
				<td>
					<a href="AccountController?txtAction=edit&id=${inforu.id}">Edit |</a>
					<a href="AccountController?txtAction=delete&id=${inforu.id}" onclick="return confirm('Are you sure to delete this data?')"> Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>