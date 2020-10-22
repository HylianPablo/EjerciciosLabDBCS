/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Despliegue;

import Dominio.Productos;
import Persistencia.ProductosFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Propietario
 */
@Stateless
public class Session implements SessionRemote{
    @EJB
    private ProductosFacadeLocal productosFacade;

    @Override
    public void frase(){
        System.out.println("Test EJ1T4");
    }

    @Override
    public void create(Productos productos) {
        productosFacade.create(productos);
    }

    @Override
    public Productos find(Integer id){
        return productosFacade.find(id);
    }
    
    @Override
    public void edit(Productos productos){
        productosFacade.edit(productos);
    }
    
    @Override
    public void remove(Productos productos){
        productosFacade.remove(productos);
    }
    
}
