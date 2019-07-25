<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Kids Art 4 Charity</title>
</head>
<style>
* {
  box-sizing: border-box;
}

.side{
 flex: 30%; /* Set the width of the sidebar */
 /* width : 200px;*/
  background-color: #f1f1f1; /* Grey background color */
  padding: 20px; /* Some padding */
}
.side a {
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
/* Main column */
.main { 
  flex: 70%; /* Set the width of the main content */
  background-color: yellow; /* White background color */
  padding: 20px; /* Some padding */
}
/* Create two unequal columns that sits next to each other */
/* Sidebar/left column */
.side {
  flex: 30%; /* Set the width of the sidebar */
  background-color: #f1f1f1; /* Grey background color */
  padding: 20px; /* Some padding */
}


/* Column container */
.row { 
  display: flex;
  width : 100%;
/*  flex-wrap: wrap;*/
}
</style>
<body>
<div class="row">
<div class="side">
<p > Browse Art </p>
<a href="Price" >--Price</a>
<a href="Subject" >--Subject</a>
<a href="Artist's Age" >--Artist's Age</a>
</div>
<div class="main">
<p>
${message}
<form:form action="register" modelAttribute="user">
<div class="container">
<form:label path="firstname" >First Name </form:label>
<br>
<form:input  path="firstname" placeholder="Enter First Name" required="required" ></form:input>
<br>
<form:label path="lastname" >Last Name </form:label>
<br>
<form:input  path="lastname" placeholder="Enter Last Name" required="required" ></form:input>
<br>
<form:label path="emailid" class="email_label">Email Address</form:label>
<br>
<form:input  path="emailid" placeholder="Enter Email Id" required="required" ></form:input>
<br>
<form:label class="pwd_label" path="password">Password</form:label>
<br>
<form:input   path="password" placeholder="Enter Password" required="required" ></form:input>
<br>
<input type ="submit"  value="Submit" ></input>
</div>
</form:form>
<p>
</div>
</div>

</body>
</html>