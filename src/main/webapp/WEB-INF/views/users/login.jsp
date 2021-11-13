<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/users/login" method="post" >	
		<label>Username</label> <input type="text" name="username" /> <br /> <br /> 
		<label>Password</label> <input type="text" name="password" /> <br /> <br /> 
		<input type="submit" value="login" />
	</form>
	if you don't have an account => <a href="${pageContext.request.contextPath}/users/signup" >Sign up</a>
</body>
</html>