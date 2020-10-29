/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1jpav2client;

import Despliegue.sessionRemote;
import Dominio.Productos;
import javax.ejb.EJB;

/**
 *
 * @author arome
 */
public class Main {
    @EJB
    private static sessionRemote session;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        session.prueba();
        
        //CREATE
        Productos p = new Productos();
        p.setProdId(50);
        p.setProdDescription("sample product v2");
        p.setItemId("50");
        p.setProdPrice(50f);
        session.create(p);
        
        //RETRIEVE
        Productos comprobar = session.comprobarProducto(50); //CON ESTA SE BUSCA A TRAVES DEL PROD ID
        Productos comprobarV2 = session.comprobarProductoV2(5); //LA ID DE PRODUCTOS SE AUTOINCREMENTA, TENDRIA QUE METER LA ID DEL QUE QUISIERA COMPROBAR
        System.out.println(comprobarV2.getProdPrice());
        System.out.println(comprobar.getProdPrice());
        
        //UPDATE
        comprobar.setProdDescription("sample product updated v2");        
        session.actualizarProducto(comprobar);
        
        //DELETE
        session.borrarProducto(comprobar);     
    }
    
}
