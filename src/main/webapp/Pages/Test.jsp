<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="100">
	<tr>
		<td>ONE</td>
		<td>TWO</td>
	</tr>
	 <s:iterator value="#{'1':'one','2':'two','3':'three'}" var="name" >
		<tr>
			<td><s:property value="key"/></td>
			<td><s:property value="value"/></td>	
		</tr>
	</s:iterator>
</table>
</body>
</html>