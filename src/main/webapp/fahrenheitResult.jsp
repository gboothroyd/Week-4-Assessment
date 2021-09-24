<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
<p>${userTempGauge.getTemp()} This is your temperature you entered converted to fahrenheit: <br />
${userTempGauge.getfTemp()} degrees fahrenheit. 
</p>
<a href="index.jsp">Enter another temperature</a>
</html>