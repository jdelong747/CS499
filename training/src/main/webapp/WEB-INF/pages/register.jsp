<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<h2>This is where you register</h2>
	<a href="home">Home</a>
	<br>
	<form:form action="registerUser" method="post" commandName="registrationForm">
		First Name: <form:input path="firstName"/><br>
		Last Name: <form:input path="lastName"/><br>
		UserId: <form:input path="userId"/><br>
		Password: <form:password path="password"/><br>
		<input type="submit" value="Register"/>
	</form:form>
</body>
</html>