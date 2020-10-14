/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaMundo.ejemplo;

import javax.ejb.Stateless;

/**
 *
 * @author Propietario
 */
@Stateless
public class HolaMundoBean implements HolaMundo {

    @Override
    public void diHola(String nombre) {
        System.out.println("Hola "+nombre);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
