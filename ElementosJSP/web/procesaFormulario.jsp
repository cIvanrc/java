<%-- 
    Document   : procesaFormulario
    Created on : Feb 21, 2019, 2:04:50 PM
    Author     : civan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Formulario</title>
    </head>
    <body>
        <h1>Resultado de Procesar Formulario</h1>
        Usuario: <%= request.getParameter("usuario") %>
        <br>
        Password: <%= request.getParameter("password") %>
        <br>
        <br>
        <a href="index.html">Regresar</a>      
    </body>
</html>
