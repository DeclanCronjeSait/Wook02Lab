<%-- 
    Document   : agecalculator
    Created on : Sep 13, 2018, 11:59:46 AM
    Author     : 687333
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator!</title>
    </head>
    <body>
        <form method="post" action="AgeCalculatorServlet">
            Enter your age: 
            <input type="number" name="age" value="${age}"> <br>
            <input type="submit" value="Age next birthday">
        </form>
            ${message}
            <br>
            
            <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
