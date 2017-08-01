<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin Login</title>
</head>
<body>

<form name="AdminLoginFrom" method="post" action="Admins_adminLogin">
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
		<td><a href="../Admin/Personal/AdminRegister.jsp"><input type="button" name="register" value="register"></a></td>
		<td><a href="../Pages/UserLogin.jsp"><input type="button" name="toUserLogin" value="toUserLogin"></a></td>
	</tr>
</table>
</form>

</body>
</html>