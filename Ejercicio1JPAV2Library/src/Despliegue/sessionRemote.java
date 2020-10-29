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
 * @author arome
 */
@Remote
public interface sessionRemote {

    void prueba();

    void create(Productos p);

    Productos comprobarProducto(int id);

    Productos comprobarProductoV2(int id);

    void actualizarProducto(Productos p);

    void borrarProducto(Productos p);
    
}
