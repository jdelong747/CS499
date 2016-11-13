<<<<<<< HEAD
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
=======
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
>>>>>>> upstream/master
<html>
<head>
	<spring:url value="/resources/css/base.css" var="baseCss" />
	<spring:url value="/resources/css/home.css" var="homeCss" />
	<spring:url value="/resources/images/" var="images" />

	<link rel="stylesheet" type="text/css" href="${baseCss}" />
	<link rel="stylesheet" type="text/css" href="${homeCss}" />

	<title>SQS Training - Home</title>
</head>
<body>
<<<<<<< HEAD
	<div id="mainContainer" class="main-container">
		<div id="logoContainer" class="logo-container column-container">
			<img src="${images}logo.png" alt="SQS Logo" class="logo"/>
		</div>
		<div id="navBar" class="nav-bar column-container">
			<div id="navBarLink" class="nav-bar-link"><a href="http://www.sqs.com">SQS</a></div>
			<div id="navBarLink" class="nav-bar-link current-link"><a href="home">Home</a></div>
			<div id="navBarLink" class="nav-bar-link"><a href="login">Login</a></div>
			<div id="navBarLink" class="nav-bar-link"><a href="register">Register</a></div>
		</div>
		<div id="contentContainer" class="content-container column-container">
			<div id="greetingContainer" class="greeting-container column-container">
				Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean ultrices elit eu mauris mollis mattis. Quisque id neque placerat, maximus magna pharetra, aliquet libero. Proin elit tortor, ullamcorper vel elementum eu, blandit sed augue. Donec sit amet feugiat tortor. Nunc tincidunt dui magna, eu tempus tortor venenatis sit amet. Suspendisse ultricies tortor in eros mattis, at vestibulum lacus bibendum.
			</div>
			<hr>
			<div id="subscribeContainer" class="subscribe-container column-container">
				<div id="subscribePrompt" class="column-container">
					Keep up to date,
				</div>
				<button onclick="location.href = 'subscribe';" id="subscribeLink" class="subscribe-link raised-button column-container">Subscribe to our list.</button>
			</div>
		</div>
	</div>
=======
	<%@include file='toolbar.jsp'%>
>>>>>>> upstream/master
</body>
</html>