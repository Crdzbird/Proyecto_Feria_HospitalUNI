package Dao;

import LoginSistema.Login_Hospital;
import Pojos.AreaTrabajo;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ingdonaldo
 */
public class AreaDao {

    Session session = null;
    Transaction transaction;

    private void AbrirSession() throws HibernateException {
        session = Login_Hospital.sf.openSession();
        transaction = session.beginTransaction();
    }

    public List<AreaTrabajo> getAll() {
        try {
            AbrirSession();
            Query q = session.createQuery("from AreaTrabajo");
            return q.list();
        } catch (Exception e) {
            return new ArrayList<>();
        } finally {
            session.close();
        }
    }

    public AreaTrabajo getById(int id) {
        try {
            AbrirSession();
            return (AreaTrabajo) session.get(AreaTrabajo.class, id);
        } catch (Exception e) {
            return null;
        } finally {
            session.close();
        }
    }
}
