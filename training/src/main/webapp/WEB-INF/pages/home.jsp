<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
	<h2>Welcome To The SQS Training Website</h2>
	<c:if test="${user != null}">
		You are logged in as ${user.userId}<br>
	</c:if>
	<a href="login">Login</a>
	<a href="register">Register</a>
	<a href="subscribe">Subscribe</a>
</body>
</html>