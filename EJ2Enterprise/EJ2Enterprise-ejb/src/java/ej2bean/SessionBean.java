/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2bean;

import javax.ejb.Stateless;

/**
 *
 * @author Propietario
 */
@Stateless
public class SessionBean implements SessionLocal {

    @Override
    public double conversion(double km) {
        return 0.621371*km;
    }
}
