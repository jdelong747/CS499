<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
	<h2>This is where you subscribe to the email list</h2>
	<a href="home">Home</a><br>
	<c:if test="${user != null}">
		You are logged in as ${user.userId}<br>
	</c:if>
	<form:form action="subscribeEmail" method="post" commandName="emailForm">
		Email: <form:input path="email"/><br>
		<input type="submit" value="Subscribe"/>
	</form:form>
</body>
</html>