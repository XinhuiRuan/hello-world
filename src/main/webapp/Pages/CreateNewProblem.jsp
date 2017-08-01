<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create a new job</title>
<style>
.one{margin-top:10px}
.two{height:150px;width:600px}
.three{height:20px;width:300px}
</style>
</head>
<body>
<%-- <% String user_id = request.getParameter("user_id"); 
%>  --%>
<form name="CreateProblemForm" method="post" action="Main_addProblem" onsubmit="return check(this)">
<%-- <input type="text" style="display:none" name="user_id" value="<%=user_id%>"/> --%>
<div class="one">Problem Name: <input type="text" name="problem_name"></div>
<div class="one">
	Content<br>
	<textarea class="one two" name="problem_content"></textarea>
</div>
<div class="one">
	Labels<br>
	<input class="three" type="text" name="problem_labels">
</div>
<div class="one"><input type="button" name="Upload" value="Upload"></div>
<hr>
<div class="one">
	<input type="submit" name="submit" value="Submit">
	<a href="MainPage.jsp"><input type="button" name="Back" value="Back"></a>
</div>
</form>
</body>
</html>