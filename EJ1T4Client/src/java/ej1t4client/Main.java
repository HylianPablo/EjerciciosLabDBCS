/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1t4client;

import Despliegue.SessionRemote;
import Dominio.Productos;
import javax.ejb.EJB;

/**
 *
 * @author Propietario
 */
public class Main {
    @EJB
    private static SessionRemote session;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Productos p = new Productos();
        p.setProdId(99);
        p.setProdDescription("sample product");
        p.setItemId("99");
        p.setProdPrice(10f);
        session.create(p);
        
        Productos p2 = session.find(6);
        System.out.println("RETRIEVE PRODDESCRIPTION: "+p2.getProdDescription());
        
        p2.setProdDescription("Producto test MODIFIED");
        session.edit(p2);
        
        session.remove(p);
                
    }
    
}
