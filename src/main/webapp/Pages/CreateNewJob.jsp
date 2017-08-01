<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
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
${sessionScope.user_id } ---->
<form name="CreateJobForm" method="post" action="Main_addJob" onsubmit="return check(this)">
<table>
<tr>
	<td>Job Name: </td>
	<td><input type="text" name="job_name"></td>
</tr>
<tr><!-- 在后台取出的的是ID值 -->
	<s:select label="Select Problem" name="jobProblem" list="problemList"
		 listKey="problem_id" listValue="problem_name" headerKey="0" headerValue="Please select a problem"/>
</tr>
	<s:select label="Job Type" name="jobType" list="{'Run This Job','Find Solution','Find Best Solution' }"
		headerKey="0" headerValue="Please select a job type"/>
<tr>
	<s:select label="Strategy" name="jobStrategy" list="{'S_0','S_1','S_2' }"
		headerKey="0" headerValue="Please select a Strategy"/>
</tr>
<tr>
<s:select label="Job Priority" name="jobPriority" list="{'1','2','3','4','5' }"
		headerKey="0" headerValue="Please select a job priority"/>
</tr>
<%-- Priority: <select>
				<option>1</option><option>2</option><option>3</option>
	     </select> --%>
<tr>
	<td><input type="submit" name="submit" value="Submit"></td>
	<td><a href="MyJob.jsp"><input type="button" value="Create"></a></td>
	<td><input type="button" name="Back" value="Back" onclick="javascript:history.go(-1);"></td>
</tr>
</table>
</form>
</body>
</html>