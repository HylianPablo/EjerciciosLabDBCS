/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Despliegue;

import javax.ejb.Stateless;

/**
 *
 * @author arome
 */
@Stateless
public class SessionEj2 implements SessionEj2Local {

    @Override
    public String getNombre(String nombre) {
        return "hola mundo" + nombre;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
