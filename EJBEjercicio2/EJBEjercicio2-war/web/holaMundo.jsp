<%-- 
    Document   : holaMundo
    Created on : 08-oct-2020, 11:37:26
    Author     : arome
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <jsp:useBean id="nombre" class="java.lang.String" scope="session">  
    </jsp:useBean>
    <body>
        <h1><%= request.getAttribute("nombre2") %></h1>
    </body>
</html>
