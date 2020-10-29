/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Despliegue;

import Dominio.Productos;
import Persistencia.ProductosFacadeLocal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author arome
 */
@Stateless
public class session implements sessionRemote {
    @EJB
    private ProductosFacadeLocal productosFacade;

    
    
    @Override
    public void prueba() {
        System.out.println("PRUEBA");
    }
    
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void create(Productos p) {
        productosFacade.create(p);
    }
       
    @Override
    public Productos comprobarProducto(int id) {
        System.out.println("COMPROBAR2");
        String temp = Integer.toString(id);
        List<Productos> lista;
        lista = productosFacade.findAll();
        for(int i = 0; i<lista.size(); i++){
            if(lista.get(i).getItemId().equals(temp)){
                return lista.get(i);
            }
        }       
        return null;
    }

    @Override
    public Productos comprobarProductoV2(int id) {
        return productosFacade.find(id);
    }

    @Override
    public void actualizarProducto(Productos p) {
        System.out.println("COMPROBAR3");
        productosFacade.edit(p);
    }

    @Override
    public void borrarProducto(Productos p) {
        System.out.println("COMPROBAR4");
        productosFacade.remove(p);
    }
    
    
    
    
}
