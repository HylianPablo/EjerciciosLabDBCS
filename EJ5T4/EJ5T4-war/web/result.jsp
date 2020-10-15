<%-- 
    Document   : result
    Created on : 15-oct-2020, 11:58:58
    Author     : Propietario
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Dominio.Productos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="listaProductos" class="java.util.List" scope="session">  
        </jsp:useBean>
        <%
            List<Productos> lista = listaProductos;
            for(int i=0;i<lista.size();i++){
                %>
                <p><%=lista.get(i).getProdDescription()%></p>
            <%}%>
    </body>
</html>
