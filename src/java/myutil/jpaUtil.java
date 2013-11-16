/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myutil;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author carlos
 */
public class jpaUtil {

    private static final EntityManagerFactory emf;

    static {
        try {
            emf = Persistence.createEntityManagerFactory("NahuatPU");
        } catch (Throwable ex) {
// Log the exception.
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }
    
    public static String baseurl(){

        return "http://localhost:8080/Demo_Login01/";
        //http://localhost:8080/Demo_Login01/views/inicio.xhtml
        
    }
    
    public static String basepath(){

        return "/Demo_Login01/";
    }
}
