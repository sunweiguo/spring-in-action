<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{
background-image:url(../images/sb.gif);
background-color: #ccc;
}
</style>
</head>
<body>
 	<h1>Your Profile</h1>
    <c:out value="${spitter.username}" /><br/>
    <c:out value="${spitter.firstName}" /> <c:out value="${spitter.lastName}" /><br/>
    <c:out value="${spitter.email}" /><br>
    已经上传的图片如下：<br/>
     <c:forEach var="pics" items="${Pics}"> 
        ${pics.value }<a href="<c:url value="/spitter/download?filename=${pics.value }"/>">download</a>
         <br/>  
    </c:forEach>
</body>
</html>
