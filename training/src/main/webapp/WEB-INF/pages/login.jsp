<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<%@include file='toolbar.jsp'%>
	<br>
	<form:form action="loginUser" method="post" commandName="loginForm">
		<table>
			<tr>
				<td>UserId:</td>
				<td><form:input path="userId" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><form:password path="password" /><br></td>
		</table>
		<input type="submit" value="Login" />
	</form:form>
</body>
</html>