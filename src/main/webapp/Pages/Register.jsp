<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Registration</title>
</head>
<body>
<form name="RegisterForm" method="post" action="Users_addUser" onsubmit="return check(this)">
<table>
	<tr>
		<td>User name:</td>
		<td><input type="text" name="user_name"></td>
	</tr>
	<tr>
		<td>Password:</td>
		<td><input type="text" name="user_password"></td>
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