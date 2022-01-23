<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="HandleFormInput" method="get">
		<label for="fname">First Name:</label><br>
		<input type="text" id="fname" name="fname" value="Supun">
		<br>
		<label for="lname">Last Name:</label><br>
		<input type="text" id="lname" name="lname" value="Mathee">
		<br>
		<label for="age">Age:</label><br>
		<input type="text" id="age" name="age" value="21">
		<br>
		<label for="city">City:</label><br>
		<input type="text" id="city" name="city" value="Colombo">
		<br><br>
		<input type="submit" value="Submit">
	</form>

</body>
</html>