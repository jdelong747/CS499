<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!-- obsolete? -->
<html>
<body>
	<h2>Emails in database</h2>
	<a href="home">Home</a><br>
	<a href="subscribe">Subscribe</a><br>
	<c:forEach var="email" items="${emails}">
		${email.email}<br>
	</c:forEach>
</body>
</html>