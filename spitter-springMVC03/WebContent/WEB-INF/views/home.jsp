<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>home</title>
</head>
<body>
	<h1><s:message code="spitter.welcome"></s:message> </h1>
	<a href="<c:url value="/spittles"/>">c:spittles</a> | 
	<a href="<c:url value="/spitter/register" />">c:Register</a>
	<br>
	<a href='<s:url value="/spitter/register"></s:url>'>s:Register</a>
</body>
</html>
