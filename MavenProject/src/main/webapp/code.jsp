<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	body {
	text-align: center;
	margin-top: 100px;
	font-size: 20px;
}

input {
	font-size: 18px; outline : none;
	border-radius: 10px;
	padding: 2px 15px 5px 5px;
	padding-left: 10px;
}

input:focus {
	background-color: #393E46;
	border-radius: 10px;
	color: white;
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
a{
	color: 185ADB;
}
#div3 {
border: 2px solid #558776;
 padding:30px 80px;
  background-color: #FFA900;
	box-shadow: 10px 10px 5px #C68B59;
	border-radius: 10px;
}
	

</style>
</head>
<body>
	<h1>TWO FACTOR AUTHENTICATION SYSTEM</h1>
	<form action="Codetwilio" method="post">
<div id="div3">
<h1>ENTER 5-DIGIT CODE HERE!</h1><br>
		<label>Twilio Code:</label>
		<input type="number" required="required"
			placeholder="Enter Code" name="input"><br>
		<br> <input type="submit" value="submit" id="btn">
</div>
	</form>
</body>
</html>