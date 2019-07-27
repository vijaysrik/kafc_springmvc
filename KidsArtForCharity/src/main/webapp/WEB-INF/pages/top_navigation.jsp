<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<link href="topnav.css " rel="stylesheet" type="text/css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Kids Art For Charity</title>
</head>
<body>
<div class="topnav_left_top">
<a href ="#home"  class="logo">Kids Art 4 Charity</a>
</div>
<div class="topnav_right_top">
<input type="text" class="searchbar" placeholder="Search for artworks or artists" value="">
</div>
<br>
<spring:url value="/user/displayRegister" var="register"></spring:url>
<spring:url value="/user/displayLogin" var="login"></spring:url>
<div class="topnav_bottom">

<a href="#Cart" >Cart </a>
<a href="${register}"> Register</a>
<a href="${login}" >Login </a>
<a href="#home" >HOME </a>

</div>
</body>
</html>