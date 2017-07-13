<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>新建一个新的用户</h2>
<form:form method="POST" modelAttribute="user">
		<form:input type="hidden" path="id" id="id"/>
		<table>
			<tr>
				<td><label for="name">姓名: </label> </td>
				<td><form:input path="name" id="name"/></td>
				<td><form:errors path="name" cssClass="error"/></td>
		    </tr>
	    
			<tr>
				<td><label for="registerTime">时间: </label> </td>
				<td><form:input path="registerTime" id="registerTime"/></td>
				<td><form:errors path="registerTime" cssClass="error"/></td>
		    </tr>
	
			<tr>
				<td><label for="salary">薪水: </label> </td>
				<td><form:input path="salary" id="salary"/></td>
				<td><form:errors path="salary" cssClass="error"/></td>
		    </tr>
		    
			<tr>
				<td colspan="3">
					<c:choose>
						<c:when test="${edit}">
							<input type="submit" value="Update"/>
						</c:when>
						<c:otherwise>
							<input type="submit" value="Register"/>
						</c:otherwise>
					</c:choose>
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>