<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User_list</title>
</head>
<body>
	<c:if test="${not empty msg}">
		<h3 style="color:red; text-align:center">${msg}</h3>
	</c:if>
	
	
	<c:choose>
		<c:when test="${not empty datas}">
			<c:forEach items="${datas}" var="users">
				${users.userName} - ${users.fullName} - ${users.id}
			</c:forEach>
		</c:when>
		<c:otherwise>
		 	<div><p style='color:red'>Data Empty</p></div>
		</c:otherwise>
	</c:choose>
	
	
</body>
</html>