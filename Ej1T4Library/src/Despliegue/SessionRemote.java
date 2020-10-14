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
public interface SessionRemote {
    public void frase();
    
    public void create(Productos producto);
}
