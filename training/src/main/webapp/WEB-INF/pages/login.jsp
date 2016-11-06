<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<html>
<body>
	<a href="home">Home</a>
	<form:form action="loginUser" method="post" commandName="loginForm">
		UserId: <form:input path="userId"/><br>
		Password: <form:password path="password"/><br>
		<input type="submit" value="Login"/>
	</form:form>
</body>
</html>