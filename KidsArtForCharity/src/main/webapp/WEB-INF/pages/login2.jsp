<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Kids Art For Charity - Login</title>
</head>
<body>
<form action="login">
<div class="container">

<label class="email_label">Email Address</label>
<br>
<input type="text" name="$user.email" placeholder="Enter Email Id" required ></input>
<br>
<label class="pwd_label">Password</label>
<br>
<input type="password" name="$user.password" placeholder="Enter Password" required ></input>
<br>
<input type ="submit" name="login"  ></input>
</div>
</form>
</body>
</html>