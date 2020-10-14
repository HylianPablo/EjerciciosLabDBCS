/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysession;

import javax.ejb.Stateless;

/**
 *
 * @author Propietario
 */
@Stateless
public class Session implements SessionRemote {
    
    @Override
    public void diHola(String nombre) {
        System.out.println("Hola "+nombre);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
