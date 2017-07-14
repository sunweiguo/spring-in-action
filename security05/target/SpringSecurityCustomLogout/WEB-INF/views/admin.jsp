<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Admin page</title>
</head>
<body>
	您好， <strong>${user}</strong>, 欢迎访问管理员页面！
	<a href="<c:url value="/logout" />">注销</a>
</body>
</html>