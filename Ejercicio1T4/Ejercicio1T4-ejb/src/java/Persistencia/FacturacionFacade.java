/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Dominio.Facturacion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Propietario
 */
@Stateless
public class FacturacionFacade extends AbstractFacade<Facturacion> implements FacturacionFacadeLocal {
    @PersistenceContext(unitName = "Ejercicio1T4-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FacturacionFacade() {
        super(Facturacion.class);
    }
    
}
