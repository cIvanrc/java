<%-- 
    Document   : index
    Created on : Feb 21, 2019, 11:59:30 AM
    Author     : civan
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hola mundo JSP</title>
    </head>
    <body>
        <h1>Hello World con JSPs!</h1>
        <ul>
            <li>Hola mundo con HTML 
            <li> <% out.print("Hola mundo con Scriptlets"); %> 
            <li> ${ "Hola mundo con Expression Language (EL)" }
            <li> <c:out value="Hola Mundo con JSTL"/>    
        </ul>
        <ul>
            <li> Hola: <%= new java.util.Date() %>
            <li> Nombre del Contexto de la aplicacion : <%= request.getContextPath() %>
            <li> Valor del parametro x: <%= request.getParameter("x") %>
        </ul>
    </body>
</html>
