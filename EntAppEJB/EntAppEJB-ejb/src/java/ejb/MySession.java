/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateless;

/**
 *
 * @author arome
 */
@Stateless
public class MySession implements MySessionRemote {
    
    /*
    @Override
    public String getResult() {
        return "This is My Session Bean";
    }*/
    
    
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void diHola(String nombre) {
        System.out.println("Hola " + nombre);
    }

    @Override
    public String diHola3(String nombre) {
        return "hola " + nombre;
    }

    @Override
    public String getResult() {
        return "This is My Session Bean";
    }
}
