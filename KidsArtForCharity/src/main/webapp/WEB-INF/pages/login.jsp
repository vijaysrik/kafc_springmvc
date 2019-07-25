<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<link href="<c:url value="/resources/css/topnav.css"/>"  rel="stylesheet" type="text/css"/>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Kids Art For Charity</title>
</head>
<style>
.nav{
display:block;
}
.main{
display:block;
float:left;
}

</style>
<body>
<div class="nav">
<%@include file="top_navigation.jsp" %>
</div>
<br>
<br>
<br>
<br>
<div class="main">
<%@include file="loginForm.jsp" %>
</div>
</body>
</html>