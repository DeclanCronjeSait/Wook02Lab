<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 13, 2018, 12:33:06 PM
    Author     : 687333
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    
    <body>
        <form method="post" action="arithmetic">
            
            First: 
            <input type="number" name="valueOne" value="${valueOne}">
            <br>
        
            Second:
            <input type="number" name="valueTwo" value="${valueTwo}">
            <br>
            <br>
            
            <input type="submit" name="mathButton" value="+">
            <input type="submit" name="mathButton" value="-">
            <input type="submit" name="mathButton" value="*">
            <input type="submit" name="mathButton" value="%">
            <br>
            
            ${message}
            <br>
        
            Result: ${result}
            
        </form>
            
        <a href="AgeCalculatorServlet">Age Calculator</a>

    </body>
</html>
