package lk.ijse.gdse.hibernate;

import lk.ijse.gdse.hibernate.embaded.CustName;
import lk.ijse.gdse.hibernate.entity.Customer;
import lk.ijse.gdse.hibernate.util.SessionFactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EtechState {
    public static void main(String[] args) {
        Session session = SessionFactoryConfiguration.getInstance().getSession();
        Transaction  transaction = session.beginTransaction();

        Customer customer = new Customer();
        customer.setId(001);
        customer.setAddress("Galle");
        customer.setAge(21);
        customer.setSalary(50000);

        session.save(customer);
        transaction.commit();

        CustName custName = new CustName();
        custName.setFirstName("janith");
        custName.setMiddleName("Induwara");
        custName.setLastName("Nanayakkara");
        customer.setName(custName);

        System.out.println(customer);
        session.close();

        Session session1 = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction1 = session1.beginTransaction();
        session.merge(customer);
        transaction1.commit();
        session1.close();

        session.save(customer);
        session.close();

    }
}
