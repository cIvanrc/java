<%-- 
    Document   : expresiones
    Created on : Feb 21, 2019, 2:03:59 PM
    Author     : civan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP de Expresiones</title>
    </head>
    <body>
        <h1>JSP de Expresiones</h1>
        Concatenacion: <%= "Saludos" + "JSP"%>
        <br>
        Operacion Matematica: <%= 2*3 / 2 %>
        <br>
        Session id: <%= session.getId() %>
        <br>
        <br>
        <a href="index.html">Regresar</a>
    </body>
</html>
