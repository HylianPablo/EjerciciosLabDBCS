/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3t4client;

import Despliegue.ControladorRemote;
import Dominio.Productos;
import javax.ejb.EJB;

/**
 *
 * @author Propietario
 */
public class Main {
    @EJB
    private static ControladorRemote controlador;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Productos p = new Productos(100);
        p.setItemId("100");
        p.setProdDescription("producto test");
        p.setProdPrice(100f);
        controlador.test();
        controlador.create(p);
        
        System.out.println("RETRIEVE PRODDESCRIPTION: "+controlador.find(6).getProdDescription());
        
        p.setProdDescription("Producto test MODIFIED");
        controlador.edit(p);
        
        controlador.remove(p);
        
        System.out.println("RECUPERADO GETPRODUCTO: "+controlador.getProducto("100"));
    }
    
}
