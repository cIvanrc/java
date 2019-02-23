<%-- 
    Document   : variablesImplicitas
    Created on : Feb 23, 2019, 12:49:50 AM
    Author     : civan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>EL y variables implicitas</h1>
        <ul>
            <li>Nombre Aplicacion: ${pageContext.request.contextPath}</li>
            <li>Navegado del Cliente: ${header["user-agent"]}</li>
            <li>Web Server: ${pageContext.servletContext.serverInfo}</li>
            <li>Valor Parametro Usuario: ${param.usuario}</li>
        </ul>
        <br>
        <br>
        <a href="index.jsp">Regresar</a>
    </body>
</html>
