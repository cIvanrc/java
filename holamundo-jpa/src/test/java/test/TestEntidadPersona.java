/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import beans.dominio.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author civan
 */
public class TestEntidadPersona {
    
    static EntityManager em = null;
    static EntityTransaction tx = null;
    static EntityManagerFactory emf = null;
    Logger log = LogManager.getRootLogger();
    
    @BeforeClass
    public static void init() throws Exception{
        emf = Persistence.createEntityManagerFactory("PersonaPU");
    }
    
    @Before
    public void setup(){
        try {
            em = emf.createEntityManager();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void testPersonaEntity(){
        log.debug("Iniciando test Persona Entity con JPA");
        
        assertTrue(em != null);
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        //No se debe especificar el ID, ya que se genera en automatico
        Persona persona1 = new Persona("nombre", "appelidoP", "apellidoM", "correo", "telefono");
        
        log.debug("Objeto a persistir: "+persona1);
        
        em.persist(persona1);
        tx.commit();
        
        assertTrue(persona1.getIdPersona() != null);
        
        log.debug("Objeto persistido: "+ persona1);
        log.debug("Fin test Persona Entity con JPA");
    }
    
    @After
    public void tearDown() throws Exception{
        if(em != null)
            em.close();
    }
} 
