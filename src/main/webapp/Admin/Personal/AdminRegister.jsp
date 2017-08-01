<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin Register</title>
</head>
<body>
<form name="AdminRegisterFrom" method="post" action="Admins_adminRegister">
<table>
	<tr>
		<td>Admin name:</td>
		<td><input type="text" name="admin_name"></td>
	</tr>
	<tr>
		<td>Password:</td>
		<td><input type="text" name="admin_password"></td>
	</tr>
	<tr>
		<td><input type="submit" name="submit" value="submit"></td>
		<td><input type="reset" name="reset" value="reset"></td>
		<td><input type="button" name="Back" value="Back" onclick="javascript:history.go(-1);"></td>
	</tr>
</table>
</form>
</body>
</html>