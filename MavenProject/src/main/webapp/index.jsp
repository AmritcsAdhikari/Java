<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>

<html>
<style>
body {
	text-align: center;
	margin-top: 100px;
	font-size: 20px;
	background-color: #F4F9F9;
}

input {
	font-size: 18px; outline : none;
	border-radius: 3px;
	padding: 2px 15px 2px 5px;
	padding-left: 10px;
	color:black;
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
a{
	color: 185ADB;
}
#div1 {
border: 2px solid #558776;
 padding:30px 80px;
  background-color: #FFA900;
	box-shadow: 10px 10px 5px #C68B59;
	border-radius: 10px;
}

</style>
<body>
	<h1>TWO FACTOR AUTHENTICATION SYSTEM</h1>
	<%
	List<String> l = (List<String>) request.getAttribute("errorList");
	if (l != null) {
		for (Iterator it = l.iterator(); it.hasNext();) {
			String error = (String) it.next();
	%>
	<div style="color: red;">
		<p><%=error%></p>
	</div>
	<%
	}
	}
	%>
	<br>

	<div>
		<form action="RegisterAccount" method="post">
			<div id="div1">
				<h1>REGISTER HERE!</h1>
				<label>Username</label> <input type="text"
					placeholder="Enter Username" name="uname" autofocus><br> <br>
				<label>Password:</label>
				<input type="password" placeholder="Enter Password" name="pass" ><br><br>
				<label>Phonenum</label> 
				<input type="number"
					placeholder="Enter Phone Number" name="phone"><br> <br>
				<input type="Submit" value="Register" id="btn"> <br>
				<a href="login.jsp">Already have an account? Click here to Login</a>
			</div>
		</form>
</body>
</html>
