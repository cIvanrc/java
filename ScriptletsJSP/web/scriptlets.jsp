<%-- 
    Document   : scriptlets
    Created on : Feb 21, 2019, 2:20:11 PM
    Author     : civan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Scriptlets</title>
    </head>
    <body>
        <h1>JSP con Scriptlets</h1>
        <% 
            out.println("Saludo desde Scriptlets");
        %>
        
        <% 
            String nombreAplicacion = request.getContextPath();
            out.println("nombreAplicacion: "+nombreAplicacion);
        %>
        
        <% 
            if (session != null && session.isNew()){ 
        %>
        la sesion SI es nueva
        <% 
            }else if(session != null){
        %>
        la sesion No es nueva
        <% 
            }
        %>
    </body>
</html>
