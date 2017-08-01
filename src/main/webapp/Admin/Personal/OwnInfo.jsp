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
		<td>Personal Information</td>
	</tr>
	<tr>
		<td>admin_id</td>
		<td>admin_name</td>
		<td>admin_password</td>
 	</tr>
	<tr>
		<td>${ad.admin_id }</td>
		<td>${ad.admin_name }</td>
		<td>${ad.admin_password }</td>
				<%-- <td>
					<a href="Users_queryUserById?user_id=${list.user_id }">Update</a>
					<a href="Users_deleteUser?user_id=${list.user_id }">Delete</a>
				</td> --%>
	</tr>
	<tr>
		<td>
			<a href="Admins_queryOwnAdmin">Update</a>
			<a href="Admins_deleteOwnAdmin">Delete</a>
		</td>
	</tr>
</table>
</body>
</html>