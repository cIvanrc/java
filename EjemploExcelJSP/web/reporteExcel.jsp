<%-- 
    Document   : reporteExcel
    Created on : Feb 21, 2019, 4:18:46 PM
    Author     : civan
--%>
<%@page import="utilerias.Conversiones, java.util.Date" %>
<%@page contentType="application/vnd.ms-excel" pageEncoding="UTF-8"%>

<% 
    String nombreArchivo = "reporte.xls";
    response.setHeader("Content-Disposition", "inline; filename="+ nombreArchivo);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reporte Excel</title>
    </head>
    <body>
        <h1>Reporte de Excel</h1>
        <br>
        <table border="1">
            <tr>
                <th>Curso</th>
                <th>Descripcion</th>
                <th>Fecha Inicio</th>
            </tr>
            <tr>
                <td>1. Fundamente de Java</td>
                <td>Aprenderemos la sintaxis basica de Java</td>
                <td><%= Conversiones.format(new Date()) %></td>
            </tr>
            <tr>
                <td>2. Fundamente de base de datos</td>
                <td>Aprenderemos la sintaxis basica de SQL</td>
                <td><%= Conversiones.format(new Date()) %></td>
            </tr>
        </table>
    </body>
</html>
