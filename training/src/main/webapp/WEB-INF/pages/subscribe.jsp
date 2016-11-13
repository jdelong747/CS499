<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<<<<<<< HEAD
	<h2>This is where you subscribe to the email list</h2>
	<a href="home">Home</a>
	<form:form action="subscribeEmail" method="post" commandName="emailForm">
		<form:input path="email" type="email" placeholder="Enter your email address"/><br>
		<input type="submit" value="Subscribe"/>
=======
	<%@include file='toolbar.jsp'%>
	<br>
	<form:form action="subscribeEmail" method="post"
		commandName="emailForm">
		<table>
			<tr>
				<td>Email:</td>
				<td><form:input path="email" /></td>
			</tr>
		</table>
		<br>
		<input type="submit" value="Subscribe" />
>>>>>>> upstream/master
	</form:form>
	<br>
	Emails in database
	<br>
	<c:forEach var="email" items="${emails}">
		${email.email}<br>
	</c:forEach>
</body>
</html>