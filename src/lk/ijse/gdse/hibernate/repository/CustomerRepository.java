package lk.ijse.gdse.hibernate.repository;

import lk.ijse.gdse.hibernate.entity.Customer;
import lk.ijse.gdse.hibernate.util.SessionFactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.Serializable;

public class CustomerRepository {
        private final Session session;
    public CustomerRepository() {
        session = SessionFactoryConfiguration.getInstance().getSession();
    }
    public Integer saveCustomer(Customer customer){
        Transaction transaction = session.beginTransaction();
/*        Integer id = (Integer) session.save(customer);
        transaction.commit();*/

        try {
            Integer id = (Integer) session.save(customer);
            transaction.commit();
            session.close();
            return id;
        }catch (Exception ex){
            transaction.commit();
            session.close();
            ex.printStackTrace();
            return -1;
        }

    }
}
