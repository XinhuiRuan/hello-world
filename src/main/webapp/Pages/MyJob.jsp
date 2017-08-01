<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My Job</title>
<style>
.one{margin-top:10px}
.two{height:150px;width:600px}
.three{margin-right:30px}
</style>
</head>
<body>
<div class="one">Job Name:<input type="text"></div>
<div class="one">Status:<input type="text"></div>
<div class="one">Problem:<a href="MyProblem.jsp"><input type="text"></a></div>
<div class="one">Strategy (Only from "Run This Job"):<input type="text"></div>
<div class="one">Priority:<input type="text"></div>
<div class="one">
<p>Progress</p> 
<textarea class="one two"></textarea>
<div class="one">
	<a href="CreateNewJob.jsp"><input class="three" type="button" value="Edit"></a>
	<input class="three" type="button" value="Delete">
	<a href="MainPage.jsp"><input type="button" value="Back"></a>
</div>
</div>
</body>
</html>