/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author civan
 */
@WebServlet(name = "CarritoServlet", urlPatterns = {"/CarritoServlet"})
public class CarritoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //Procesamos el nuevo articulo
        String articuloNuevo = request.getParameter("articulo");
        
        //Creamos o recuperamos la sesion http
        HttpSession sesion = request.getSession();
        
        //Recuperar la lista de articulos previos
        //si es que existen en la sesion
        List<String> articulos = (List) sesion.getAttribute("articulos");
        
        //Verificamos si la lista de articulos existe
        if(articulos == null){
            //si no existenn, inicializamos la lista
            //y la agregamos a la sesion
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }
        
        //ya tenemos la lista de articulos
        //agregado el nuevo articulos
        if(articuloNuevo != null && !articuloNuevo.trim().equals(""))
            articulos.add(articuloNuevo); 
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<h1>Lista de Articulos</h1>");
            out.println("<br>");
            for(String articulo : articulos)
                out.println("<li>"+ articulo + "</li>");
            
            out.println("<br>");
            out.println("<a href='/EjemploCarritoCompras'>regresar</a>");
        }
    }
}
