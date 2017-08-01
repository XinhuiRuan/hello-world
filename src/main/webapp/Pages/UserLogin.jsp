<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Log in Page</title>
</head>
<body>

<form name="UserLoginFrom" method="post" action="Main_userLogin">
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
		<td><a href="Register.jsp"><input type="button" name="register" value="register"></a></td>
		<td><a href="../Admin/AdminLogin.jsp"><input type="button" name="toAdminLogin" value="toAdminLogin"></a></td>
	</tr>
</table>
</form>
</body>
</html>