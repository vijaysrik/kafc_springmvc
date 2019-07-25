<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Kids Art 4 Charity</title>
</head>
<style>
* {
  box-sizing: border-box;
}

.sidebar{
 flex: 30%; /* Set the width of the sidebar */
 /* width : 200px;*/
  background-color: #f1f1f1; /* Grey background color */
  padding: 20px; /* Some padding */
}
.sidebar a {
 /* background-color: #eee; /* Grey background color */
  color: black; /* Black text color */
  display: block; /* Make the links appear below each other */
  padding: 12px; /* Add some padding */
  text-decoration: none; /* Remove underline from links */
}
.browse{
flex: 30%;
background-color: #eee;
padding: 12px;
}
</style>
<body>
<div class="sidebar">
<p > Browse Art </p>
<a href="Price" >--Price</a>
<a href="Subject" >--Subject</a>
<a href="Artist's Age" >--Artist's Age</a>
</div>
</body>
</html>