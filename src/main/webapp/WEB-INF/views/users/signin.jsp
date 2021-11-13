<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign_in</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/users/signin" method="post" >	
		<label>Username</label> <input type="text" name="userName" /> <br /> <br /> 
		<label>Password</label> <input type="text" name="passWord" /> <br /> <br /> 
		<label>Fullname</label> <input type="text" name="fullName" /> <br /> <br /> 
		<input type="submit" value="signin" />
	</form>
</body>
</html>