/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author civan
 */
public class ListaRectangulos {
    
    private List<Rectangulo> lista = new ArrayList<>();
    
    /**
     * Este metodo nos permite simular una propiedad llamada "rectangulo" desde
     * la accion jsp:setProperty en un JSP
     * @param r 
     */
    public void setRectangulo(Rectangulo r){
        this.lista.add(r);
    }

    public List<Rectangulo> getLista() {
        return lista;
    }

    public void setLista(List<Rectangulo> lista) {
        this.lista = lista;
    }
     
}
