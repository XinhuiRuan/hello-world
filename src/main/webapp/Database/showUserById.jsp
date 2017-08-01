<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Edit</title>
</head>
<body>
<form name="EditForm" method="post" action="Users_updateUser" onsubmit="return check(this)">
<table>
	<tr>
		<td>User Id:</td>
		<td><input type="text" name="user_id" value="${u.user_id }" readonly="readonly"></td>
	</tr>
	<tr>
		<td>User name:</td>
		<td><input type="text" name="user_name" value="${u.user_name }"></td>
	</tr>
	<tr>
		<td>Password:</td>
		<td><input type="text" name="user_password" value="${u.user_password }"></td>
	</tr>
	<tr>
		<td><input type="submit" name="submit" value="submit"></td>
		<td><input type="reset" name="reset" value="reset"></td>
		<td><a href="Login.jsp"><input type="button" name="register" value="back"></a></td>
	</tr>
</table>
</form>
</body>
</html>