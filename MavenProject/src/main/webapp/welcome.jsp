<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success!</title>
<style>


body {
	text-align: center;
	margin-top: 100px;
	font-size: 20px;
}

input {
	font-size: 18px;
	outline: none;
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

h1 {
	font-size: 50px;
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

#div1 {
	border: 2px solid #558776;
	padding: 30px 80px;
	background-color: #FFA900;
	box-shadow: 10px 10px 5px #C68B59;
	border-radius: 10px;
}

#success {
	color: green;
}
</style>

</head>
<body>

	<h1>
		TWO FACTOR AUTHENTICATION SYSTEM
		</h2>

		<form action="Logout" method="post">
			<div id="div1">
				<h1>Hey User !!</h1>
				<h2 id="success">USER AUTHENTICATED
	</h1>

	<input type="submit" value="Log Out" id="btn">
	</div>
	</form>

</body>
</html>