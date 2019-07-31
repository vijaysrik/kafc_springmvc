<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link href="topnav.css " rel="stylesheet" type="text/css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
.dropbtn {
  background-color: #4CAF50;
  color: white;
  padding: 16px;
  font-size: 16px;
  border: none;
}

.dropdown {
  position: relative;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f1f1f1;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown-content a:hover {background-color: #ddd;}

.dropdown:hover .dropdown-content {display: block;}

.dropdown:hover .dropbtn {background-color: #3e8e41;}
</style>
<title>Kids Art For Charity</title>
</head>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<body>
<div class="topnav_left_top">
<a href ="#home"  class="logo">Kids Art 4 Charity</a>
</div>
<div class="topnav_right_top">
<input type="text" class="searchbar" placeholder="Search for artworks or artists" value="">
</div>
<br>
<div class="topnav_bottom">
<spring:url value="/art/displayRegisterArtist" var="register" htmlEscape="true"/>
<spring:url value="/art/displayListingForm" var="listingForm" htmlEscape="true"/>
<spring:url value="/home" var="home" htmlEscape="true"/>
<a href="#Cart" >Cart </a>
<div class="dropdown">
<button class="dropbtn" > Sell Art </button>
  <div class="dropdown-content">
	<a href="${register}"> Register New Artist</a>
    <a href="${listingForm}">Add a New Listing</a>
  </div>
</div>
<a href="#" >${loggedInUser.emailid} </a>
<a href="${home}" >HOME </a>

</div>
</body>
</html>