<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head></head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style type="text/css">

body {
	text-align: center;
	margin-top: 100px;
	font-size: 20px;
	background-color: #F4F9F9;
}
input {
	font-size: 18px;
	outline: none;
	border-radius: 3px;
	padding: 2px 15px 5px 5px;
	padding-left: 10px;
}



input:focus {
	background-color: #39E46;
	border-radius: 5px;
	color: black;
	box-shadow: 2px 2px 2px #D6D2C4;
}

form {
	display: inline-block;
	color: black;
}

h1, h2, label {
	background-color: white;
	font-weight: bolder;
	margin-right: 5px;
}

#btn {
	border-radius: 10px;
}

#btn:hover {
	background-color: #78DEC7;
	color: black;
	font-weight: bold;
	cursor: pointer;
}

a {
	color: 185ADB;
}

#login_container {
	border: 2px solid #558776;
	padding: 30px 80px;
	background-color: #FFA900;
	box-shadow: 10px 10px 5px #C68B59;
	border-radius: 10px;

}


</style>
</head>

<body>
	<h1>TWO FACTOR AUTHENTICATION SYSTEM</h1>
	<%
	String error = (String) request.getAttribute("errorList");
	if (error != null) {
	%>
	<font color="red">
		<ul><%=error%></ul>
	</font>
	<%
	}
	%>
	<form action="Login" method="post">
		<div id="login_container" >
			<h1>LOGIN HERE!</h1>
			<label>Username</label> <input type="text"
				placeholder="Enter Username" name="username" autofocus required><br>
			<br> <label>Password:</label> <input type="password"
				placeholder="Enter password" name="password" required> <br>
			<br> <input type="submit" value="Log In" id="btn"><br>
			<a href="index.jsp">Don't have an account? Click here to REGISTER</a>
		</div>
	</form>
</body>
</html>