<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
.one{margin-top:10px}
.two{height:150px;width:600px}
.three{height:20px;width:300px}
</style>
</head>
<body>
<form name="EditForm" method="post" action="Main_updateProblem" onsubmit="return check(this)">
<%--  <input type="text" style="display:none" name="user_id" value="${u.user_id }"> --%>
<input type="text" style="display:none" name="problem_id" value="${p.problem_id }">
<div class="one">Problem Name: <input type="text" name="problem_name" value="${p.problem_name }"></div>
<div class="one">
	Content<br>
	<textarea class="one two" name="problem_content" >${p.problem_content }</textarea>
</div>
<div class="one">
	Labels<br>
	<input class="three" type="text" name="problem_labels" value="${p.problem_labels }">
</div>
<hr>
<div class="one">
	<input type="submit" name="submit" value="submit">
	<input type="button" name="Back" value="Back" onclick="javascript:history.go(-1);">	
</div>
</form>
</body>
</html>