<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
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
	</form:form>
</body>
</html>