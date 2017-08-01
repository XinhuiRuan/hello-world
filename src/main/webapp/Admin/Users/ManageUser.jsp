<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.user.user" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<td>User List</td>
	</tr>
	<tr>
		<td>user_id</td>
		<td>user_name</td>
		<td>user_password</td>
		<td>Update Numbers</td>
		<td>Delete</td>
	</tr>
	<c:forEach var="list" items="${list}">
			<tr>
				<td>${list.user_id }</td>
				<td>${list.user_name }</td>
				<td>${list.user_password }</td>
				<td>
					<a href="Admins_queryUserById?user_id=${list.user_id}">Update</a>
					<a href="Admins_deleteUser?user_id=${list.user_id }">Delete</a>
				</td>
			</tr>
	</c:forEach>
</table>
	<a href="Admins_showAdminPage">
	<input type="button" name="Back" value="Main Page">
	</a>
	<input type="button" name="Back" value="Last Step" onclick="javascript:history.go(-1);">
</body>
</html>