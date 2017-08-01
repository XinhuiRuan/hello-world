<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin Page</title>
</head>
<body>
${sessionScope.admin_name } Welcome
<br>
<a href="Admins_showOwnInfo">View Personal Information</a>
<br>
<a href="Admins_showAllUser">Manage User</a>
<br>
<a href="ManageProblem.jsp">Manage Problem</a>
</body>
</html>