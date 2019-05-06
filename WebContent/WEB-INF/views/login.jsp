<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h1>Login Page</h1>
<form:form method="get" action="check" modelAttribute="login" >
Username:<input type="text" name="uname"><br>
Password:<input type="password" name="pwd"><br>
<input type="submit" value="LOGIN">
</form:form>
</body>
</html>