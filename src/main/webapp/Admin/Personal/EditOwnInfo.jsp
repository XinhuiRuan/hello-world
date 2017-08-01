<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="EditOwnAdminForm" method="post" action="Admins_updateOwnAdmin" onsubmit="return check(this)">
<%-- <input type="text" style="display:none" name="admin_id" value="${ad.admin_id }"> --%>
<table>
	<tr>
		<td>Personal Information</td>
	</tr>
	<tr>
		<td>admin_name</td>
		<td>admin_password</td>
 	</tr>
	<tr>
		<td><input type="text" name="admin_name" value="${ad.admin_name }"></td>
		<td><input type="text" name="admin_password" value="${ad.admin_password }"></td>
	</tr>
	<tr>
		<td>
			<input type="submit" name="submit" value="submit">
		</td>
		<td><input type="button" name="Back" value="Back" onclick="javascript:history.go(-1);"></td>
	</tr>
</table>
</form>
</body>
</html>