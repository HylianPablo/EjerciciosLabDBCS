/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entappclient;

import ejb.MySessionRemote;
import javax.ejb.EJB;

/**
 *
 * @author arome
 */
public class Main {
    @EJB
    private static MySessionRemote mySession;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.err.println("result = " + mySession.getResult());
        //mySession.diHola("Alejandro");
        mySession.diHola("Alejandro");
        //System.err.println(mySession.diHola3("Alejandro"));
    }
    
}
