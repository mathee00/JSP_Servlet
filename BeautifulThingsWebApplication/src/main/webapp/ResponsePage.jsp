<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>The Response</title>
</head>
<body>

<p>Hello <%= request.getAttribute("fname") %></p>
<p>It appears that your last name is <%= request.getAttribute("lname") %> <br>

And your age is <%= request.getAttribute("age")  %> <br>

And also that your from <%= request.getAttribute("city") %> <br>

I hope you have a beautiful day </p>

</body>
</html>