package lk.ijse.gdse.hibernate;

import lk.ijse.gdse.hibernate.embaded.CustName;
import lk.ijse.gdse.hibernate.entity.Customer;
import lk.ijse.gdse.hibernate.util.SessionFactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(1);
        /*customer.setName("janith");
        customer.setAddress("Galle");
        customer.setSalary(45000.00);*/

        CustName custName= new CustName();
        custName.setFirstName("Janith");
        custName.setMiddleName("Induwara");
        custName.setFirstName("Nanayakkara");

        customer.setName(custName);
        customer.setAddress("Ahanagama");
        customer.setSalary(50000.00);

        Session session = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();
    }
}
