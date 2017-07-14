<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>DBA page</title>
</head>
<body>
	Dear <strong>${user}</strong>, Welcome to DBA Page.
	<a href="<c:url value="/logout" />">Logout</a>
		<div>
		<label>View all information| This part is visible to Everyone</label>
	</div><br/>
	<div>
		<sec:authorize access="hasRole('ADMIN')">
			<label><a href="#">Edit this page</a> | This part is visible only to ADMIN</label>
		</sec:authorize>
	</div><br/>
	<div>
		<sec:authorize access="hasRole('ADMIN') and hasRole('DBA')">
			<label><a href="#">Start backup</a> | This part is visible only to one who is both ADMIN & DBA</label>
		</sec:authorize>
	</div>
</body>
</html>