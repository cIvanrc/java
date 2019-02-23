<%-- 
    Document   : index
    Created on : Feb 23, 2019, 12:34:46 PM
    Author     : civan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ejemplo MVC 2</h1>
        <div style="color: red">
            ${mensaje}
        </div>
        <br>
        <a href="${pageContext.request.contextPath}/ServletControlador">
            Link al Servlet Controlador sin parametros
        </a>
        <br>
        <br>
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=agregaVariables">
            Link al Servlet Controlador para agregar variables
        </a>
        <br>
        <br>
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=listarVariables">
            Link al Servlet Controlador para listar variables
        </a>
    </body>
</html>
