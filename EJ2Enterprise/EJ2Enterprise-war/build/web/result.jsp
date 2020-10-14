<%-- 
    Document   : result
    Created on : 08-oct-2020, 14:49:05
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
        <jsp:useBean id="millas" class="java.lang.Double" scope="session">  
        </jsp:useBean>
        <%double millasRes = millas;%>
        <form action="Servlet" method="POST">
            <p>Introduzca el número de kilómetros a convertir, por favor:</p>
            <input type="number" name="km" value=""/>
            <input type="submit" value="Enviar" />
        </form>
        <h1>Resultado: <%=millas%></h1>
    </body>
</html>
