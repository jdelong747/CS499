<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
	<a href="home">Home</a><br>
	<c:if test="${user != null}">
		You are logged in as ${user.userId}<br>
		<a href="logout">Logout</a><br>
	</c:if>
	<c:if test="${user == null}">
		<form:form action="loginUser" method="post" commandName="loginForm">
			UserId: <form:input path="userId"/><br>
			Password: <form:password path="password"/><br>
			<input type="submit" value="Login"/>
		</form:form>
	</c:if>
</body>
</html>