/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import LoginSistema.Login_Hospital;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ingdonaldo
 */
public class Dao {
    
    Session session = null;
    Transaction transaction;

    private void AbrirSession() throws HibernateException {
        session = Login_Hospital.sf.openSession();
        transaction = session.beginTransaction();
    }
    
    public long Guardar(Object objeto) {
        int id;
        try {
            AbrirSession();
            id = (int) session.save(objeto);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
            System.out.println("Causa : " + e.getCause());
          
            return -1;
        } finally {
            session.close();
        }
        return id;
    }


    public boolean Actualizar(Object objeto) {
        try {
            AbrirSession();
            session.update(objeto);
            transaction.commit();
            return true;
        } catch (Exception e) {
            System.out.println("e :"+e.getLocalizedMessage());
            System.out.println("otro :"+ e.toString());
            System.out.println("Error :" + e.getMessage());
            System.out.println("Causa : " + e.getCause());
            return false;
        } finally {
            session.close();
        }
    }
    
}
