<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<title>Welcome to your Celsius Temperature Converter</title>
</head>
<body>
<h1>Temperature Converter</h1>
<form action="getCelsiusServlet" method="post">
Enter your fahrenheit temperature: 
<input type="text" name="userFTemp" size="10">
<input type="submit" value="Calculate Temperature" />
</form>
</body>
</html>