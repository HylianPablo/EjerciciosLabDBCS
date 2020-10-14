/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entappclient;

import holaMundo.ejemplo.HolaMundo;
import javax.ejb.EJB;

/**
 *
 * @author Propietario
 */
public class Main {
    @EJB
    private static HolaMundo ex;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ex.diHola("Pablo");
    }
    
}
