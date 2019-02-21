<%-- 
    Document   : FondoColor
    Created on : Feb 21, 2019, 2:19:49 PM
    Author     : civan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
    String fondo = request.getParameter("colorFondo");

    if(fondo == null || fondo.trim().equals(""))
        fondo = "white";
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Cambio de Color de Fondo</title>
    </head>
    <body bgcolor="<%=fondo%>">
        <h1>Fondo de color aplicado: <%= fondo %> </h1>
        <br>
        <a href="index.html">Regresar</a>
        
    </body>
</html>
