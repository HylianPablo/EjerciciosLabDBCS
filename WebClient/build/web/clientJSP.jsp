<%-- 
    Document   : clientJSP
    Created on : 08-oct-2020, 10:48:07
    Author     : Propietario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="/clientServer">
            <label for="nombre">Nombre:</label><br>
            <input type="text" id="nombre" name="nombre"><br><br>
            <input type="submit" value="Submit">
        </form> 
    </body>
</html>
