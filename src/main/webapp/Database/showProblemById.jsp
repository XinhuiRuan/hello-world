<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create a new job</title>
<style>
.one{margin-top:10px}
.two{height:150px;width:600px}
.three{height:20px;width:300px}
.four table td{border:0.5px solid}
</style>
</head>
<body>

<div class="one">Problem Name: <input type="text" name="problem_name" value="${p.problem_name }" readonly="readonly"></div>
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
	<textarea class="one two" name="problem_content" readonly="readonly">${p.problem_content }</textarea>
</div>
<div class="one">
	Labels<br>
	<input class="three" type="text" name="problem_labels" value="${p.problem_labels }" readonly="readonly">
</div>
<hr>
<div class="one">
	<input type="button" name="Back" value="Back" onclick="javascript:history.go(-1);">	
</div>
</body>
</html>