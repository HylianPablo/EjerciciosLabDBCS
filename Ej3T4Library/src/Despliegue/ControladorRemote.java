/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Despliegue;

import Dominio.Productos;
import javax.ejb.Remote;

/**
 *
 * @author Propietario
 */
@Remote
public interface ControladorRemote {
    
    public void test();
    
    public void create(Productos productos);
    
    public Productos find(Integer id);
    
    public void edit(Productos productos);
    
    public void remove(Productos productos);
    
    public Productos getProducto(String itemId);
    
}
