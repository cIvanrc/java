<%-- 
    Document   : index
    Created on : Feb 21, 2019, 2:46:20 PM
    Author     : civan
--%>

<%! 
    private String usuario = "ivan";

    public String getUsuario(){
        return this.usuario;
    }

    private int contadorVisitas = 1;
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Declaraciones</title>
    </head>
    <body>
        <h1>Declaraciones</h1>
        Usuario por medio del atributo: <%= this.usuario %>
        <br>
        Usuario por medio del metodo: <%= this.getUsuario() %>
        <br>
        Contador de visitas desde que se reinicio el Servidor:
        <%= this.contadorVisitas++ %>
    </body>
</html>
