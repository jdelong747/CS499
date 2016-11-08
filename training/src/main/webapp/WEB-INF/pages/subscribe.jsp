<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<html>
<body>
	<h2>This is where you subscribe to the email list</h2>
	<a href="home">Home</a>
	<form:form action="subscribeEmail" method="post" commandName="emailForm">
		<form:input path="email" type="email" placeholder="Enter your email address"/><br>
		<input type="submit" value="Subscribe"/>
	</form:form>
</body>
</html>