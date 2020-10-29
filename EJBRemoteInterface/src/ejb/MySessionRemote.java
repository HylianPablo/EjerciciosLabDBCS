/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Remote;

/**
 *
 * @author arome
 */
@Remote
public interface MySessionRemote {

    //String getResult();
    
    public void diHola(String nombre);

    String diHola3(String nombre);

    String getResult();
    
    
}
