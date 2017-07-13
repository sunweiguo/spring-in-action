<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="<c:url value='/add' />">增加一个新用户</a><br/>
<c:forEach items="${users }" var="user">
	${user.id }------${user.name }------${user.registerTime }------${user.salary }------<a href="<c:url value='/delete/${user.id}' />">delete</a><br/>
</c:forEach>

</body>
</html>