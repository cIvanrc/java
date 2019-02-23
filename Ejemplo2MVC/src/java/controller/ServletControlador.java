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
        
         //procesamos la peticion
         //1.- procesamo los parametros
         String accion = request.getParameter("accion");
         
         //2. creamos los JavaBean a compartir
         Rectangulo recRequest = new Rectangulo(1,2);
         Rectangulo recSession = new Rectangulo(3,4);
         Rectangulo recApplication = new Rectangulo(6,6);
         
         if("agregaVariables".equals(accion)){
             //3. Compartimos las variables de alcance
             //seleccionando
             
             //alcance request
             request.setAttribute("rectanguloRequest", recRequest);
             
             //alcance session
             HttpSession session = request.getSession();
             session.setAttribute("rectanguloSession", recSession);
             
             //alcance application
             ServletContext application = this.getServletContext();
             application.setAttribute("rectanguloApplication", recApplication);
             
             //Agregamos un mensaje
             request.setAttribute("mensaje", "Las variables fueron agregadas");
             
             //4. redireccionamos al JSP seleccionado
             request.getRequestDispatcher("index.jsp").forward(request, response);
         }else if("listarVariables".equals(accion)){
             //4. Unicamente redireccionamos, ya no agegamos variables
             // y se desplegaran solamente las que sigan disponibles
             // segun el alcance de cada variable
             
             request.getRequestDispatcher("/WEB-INF/alcanceVariables.jsp").forward(request, response);
         }else{
             //4. redireccionamos a la pagina de inicio
             //agregamos un mensaje
             System.out.println("heru");
             request.setAttribute("mensaje", "Accion no proporcionada o desconocida");
             request.getRequestDispatcher("index.jsp").forward(request, response);
             
             //Esta linea no agregaria envia la informacion al JSP
             //sino es una peticion al navegado Web
             //response.sendRedirect("index.jsp");
         }
    }
    
}
