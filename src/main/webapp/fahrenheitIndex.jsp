<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to your Fahrenheit Temperature Converter</title>
</head>

<body>
<h1>Temperature Converter</h1>
<form action="getFahrenheitServlet" method="post">
Enter your celsius temperature: 
<input type="text" name="userCTemp" size="10">
<input type="submit" value="Calculate Temperature" />
</form>
</body>
</html>