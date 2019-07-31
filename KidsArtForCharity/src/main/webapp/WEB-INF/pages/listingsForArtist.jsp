<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
  width: 70%; /* Set the width of the main content */
  background-color: yellow; /* White background color */
  padding: 20px; /* Some padding */
}
/* Create two unequal columns that sits next to each other */
/* Sidebar/left column */
.side {
  width: 30%; /* Set the width of the sidebar */
  background-color: #f1f1f1; /* Grey background color */
  padding: 20px; /* Some padding */
}


/* Column container */
.row { 
  display: flex;
  width : 100%;
  flex-wrap: wrap;
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
<div class="">
      <c:forEach items="${artWorks}" var="artWork">
        <br>
          Artist Name :<td><c:out value="${artWork.artist.name}" /><br>
          Listing ID:<c:out value="${artWork.id}" /> <br>
          Art Name: <c:out value="${artWork.name}" /><br>
          Price: <c:out value="${artWork.price}" /><br>
          Medium: <c:out value="${artWork.medium}" />  <br>
          Image: 
          <img src="data:image/jpg;base64,<c:out value="${artWork.base64Image }"/>" width="500" height="600" alt="No image">
          
          ----------------------------------------------------------------       
        <br>
      </c:forEach>
</div>
<p>
</div>
</div>

</body>
</html>