/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Dominio.Productos;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Propietario
 */
@Stateless
public class ProductosFacade extends AbstractFacade<Productos> implements ProductosFacadeLocal {
    @PersistenceContext(unitName = "Ejercicio3T4-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductosFacade() {
        super(Productos.class);
    }
    
    @Override
    public Productos getProducto(String itemId){
        Query query = em.createNamedQuery("Productos.findByItemId");
        query.setParameter("itemId",itemId);
        List<Productos> users = (List<Productos>)query.getResultList();
        if(!users.isEmpty()){
            return users.get(0);
        }else{
            return null;
        }
    }
    
}
