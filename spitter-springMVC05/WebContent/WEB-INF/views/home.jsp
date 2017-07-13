<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>home</title>
<style type="text/css">
body{
background-image:url(images/sb.gif);
background-color: #ccc;
}
</style>
</head>
<body>
	<div align="center"><h2><s:message code="spitter.welcome"></s:message> </h2>
	<a href="<c:url value="/spittles"/>">Spittles</a> | 
	<a href="<c:url value="/spitter/register" />">Register</a></div>
</body>
</html>
