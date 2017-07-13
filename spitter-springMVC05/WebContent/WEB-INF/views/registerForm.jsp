<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<html>
  <head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/css"  href="<c:url value="/css/style.css" />" >
    <style type="text/css">
		body{
		background-image:url(../images/sb.gif);
		background-color: #ccc;
		}
	</style>
  </head>
  <body>
    <div align="center"><h1>Register</h1></div>

<!--<form method="POST">
   	  Username: <input type="text" name="username" /><br/>
      Password: <input type="password" name="password" /><br/>
      First Name: <input type="text" name="firstName" /><br/>
      Last Name: <input type="text" name="lastName" /><br/>
      Email: <input type="email" name="email" /><br/>
      <input type="submit" value="Register" />
    </form>
-->
<div>
</div>
<div align="center">
<sf:form method="POST" commandName="spitter" enctype="multipart/form-data">
<sf:errors path="*" element="div" cssClass="errors"/><br>
	Username:<sf:input path="username" cssErrorClass="error"/><br>
	Password:<sf:input path="password" cssErrorClass="error"/><br>
	Firstname:<sf:input path="firstName" cssErrorClass="error"/><br>
	Lastname:<sf:input path="lastName" cssErrorClass="error"/><br>
	email:<sf:input path="email" type="email" cssErrorClass="error" /><br>
	singleFileUpload:<input name="profilePicture" type="file" accept="image/jpeg,image/png,image/jpg"><br/>
	<br>
	multipartFileUpload:<input name="profilePicture" type="file" accept="image/jpeg,image/png,image/jpg"><br/>
						<input name="profilePicture" type="file" accept="image/jpeg,image/png,image/jpg"><br/>
						<input name="profilePicture" type="file" accept="image/jpeg,image/png,image/jpg"><br/>
	<input type="submit" value="Register" />

</sf:form>
</div>
  </body>
</html>
