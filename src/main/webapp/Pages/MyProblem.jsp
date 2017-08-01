<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My Problem</title>
<style>
.one{margin-top:10px}
.two{margin-right:30px}
.three{height:150px;width:600px}
.four table td{border:0.5px solid}
</style>
</head>
<body>
<div class="one">Problem Name:<input type="text"></div>
<div class="one four">
	<table width="300" cellspacing="0">
		<caption>Statistics</caption>
		<tr>
			<td>Key1</td>
			<td>Value1</td>
		</tr>
		<tr>
			<td>Key2</td>
			<td>Value2</td>
		</tr>
	</table>
</div>
<div class="one">
Content<br>
<textarea class="one three"></textarea>
</div>
<div class="one">
	<a href="CreateNewProblem.jsp"><input class="two" type="button" value="Edit"></a>
	<input class="two" type="button" value="Delete">
	<a href="MainPage.jsp"><input type="button" value="Back"></a>
</div>
</body>
</html>