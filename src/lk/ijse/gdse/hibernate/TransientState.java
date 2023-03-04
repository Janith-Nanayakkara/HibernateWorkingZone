package lk.ijse.gdse.hibernate;

import lk.ijse.gdse.hibernate.entity.Customer;
import lk.ijse.gdse.hibernate.util.SessionFactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TransientState {
    public static void main(String[] args) {
        Session session = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = new Customer();
        customer.setAddress("Galle");
        customer.setAge(21);

        session.save(customer);

        transaction.commit();
        session.close();

        
    }
}
