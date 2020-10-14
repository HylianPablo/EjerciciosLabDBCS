/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaMundo.ejemplo;

import javax.ejb.Remote;

/**
 *
 * @author Propietario
 */
@Remote
public interface HolaMundo {

    public void diHola(String nombre);
    
}
