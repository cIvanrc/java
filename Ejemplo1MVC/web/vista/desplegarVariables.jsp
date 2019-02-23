<%-- 
    Document   : desplegarVariables
    Created on : Feb 23, 2019, 12:35:24 PM
    Author     : civan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Despliegue de Variables</h1>
        
        Variable en alcance request:
        ${mensaje}
        
        <br>
        <br>
        
        Variable en alcance session:
        <br>
        Rectangulo:
        Base: ${rectangulo.base}
        Altura: ${rectangulo.altura}
        Area: ${rectangulo.area}
        <br>
        <br>
        <a href="${pageContext.request.contextPath}/index.jsp">
            Regresar
        </a>
    </body>
</html>
