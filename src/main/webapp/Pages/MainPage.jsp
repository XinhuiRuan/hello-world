<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Theorem Prover Tuning Service</title>
<style>
.one{margin-top:10px}
.two{border:1px solid; height:150px}
.three{border:0.5px solid; height:100px}
.four{margin-top:7px}
</style>
</head>
<body>

<%-- <s:property value="user_name"/> --%> 
${sessionScope.user_name }Welcome
${sessionScope.user_id }Welcome!!
<div class="one two">My Problem<br>
	<div class="three">
		<table>
		<c:forEach var="p1" items="${set1}">
			<tr>
				<td>${p1.problem_name }</td>
				<td>${p1.problem_content }</td>
				<td>${p1.problem_labels }</td>
				<td>
					<a href="Main_showProblemById?problem_id=${p1.problem_id }">View</a>
					<a href="Main_queryProblemById?problem_id=${p1.problem_id }">Update</a>
					<a href="Main_deleteProblem?problem_id=${p1.problem_id }">Delete</a> 					
				</td>
			</tr>
		</c:forEach>
		</table>	
	</div>
	<div>
		<a href="CreateNewProblem.jsp">
		<input type="button" value="Create New Problem" class="four"/>
		</a>
	</div>
</div>
<div class="one two">My Job<br>
	<div class="three">
		<a href="MyJob.jsp">Job1</a>
		<a href="Results.jsp">Result1</a>
	</div>
	<div>
		<a href="Select_selectProblem">
		<input type="button" value="Create New Job" class="four">
		</a>
	</div>
</div>
</body>
</html>