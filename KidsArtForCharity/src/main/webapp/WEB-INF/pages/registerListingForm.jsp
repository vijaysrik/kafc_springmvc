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
<form:form action="saveArtWork" modelAttribute="artWork" enctype="multipart/form-data">
<div class="container">
<form:label path="artist.artistid" >Artist Name </form:label>
<br>
<form:select path="artist.artistid">
  	
	<form:options  items="${artistList}"/>
</form:select>
<br>
<form:label path="name" >ArtWork Name </form:label>
<form:input path="name" placeholder="Enter Name for the art" required="required"/>
<br>
<form:label path="description" >Describe the art </form:label>
<form:textarea path="description" placeholder="Enter a description"/>
<br>
<form:label path="medium" >Medium of Art</form:label>
<form:input path="medium" placeholder="Enter medium used in the art work" />
<br>
<form:label path="name" >Width : </form:label>
<form:input path="width"  /> cm
<form:label path="name" >Length : </form:label>
<form:input path="length"/> cm
<br>
<form:label path="price" >Price : </form:label>
$ <form:input path="price"/> 
<br>
<img  id="art_preview" alt="your image" width="100" height="100" ></img>
<form:label path="" >Upload Preview*</form:label>
		<input type="file" name="file" id="file"
			onchange="document.getElementById('art_preview').src = window.URL.createObjectURL(this.files[0])"
			></input>

<input type ="submit"  value="Submit" ></input>
</div>
</form:form>
<p>
</div>
</div>

</body>
</html>