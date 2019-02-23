/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import model.Rectangulo;

/**
 *
 * @author civan
 */
@WebServlet(name = "ServletControlador", urlPatterns = {"/ServletControlador"})
public class ServletControlador extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        
//        1.- En este caso no hay necesidad de procesar parametros

//        2.- Creamos los JavaBeans
        Rectangulo rec = new Rectangulo(3,6);
        
        //3.- Agregamos las variables en cierto alcance
        request.setAttribute("mensaje", "Saludos desde el servlet");
        
        HttpSession session = request.getSession();
        session.setAttribute("rectangulo", rec);
        
//        4.- Redireccionamis
        RequestDispatcher rd = request.getRequestDispatcher("vista/desplegarVariables.jsp");
//        Se propagan los objetos request y response
//                para que puedan ser utilizado por el jsp seleccionado

        rd.forward(request, response);
         //ya no se necesita hacer nada despues
         //ya que el flujo continua en el jsp seleccionado
    }
    
}
