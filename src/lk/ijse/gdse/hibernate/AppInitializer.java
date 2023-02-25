package lk.ijse.gdse.hibernate;

import lk.ijse.gdse.hibernate.embaded.CustName;
import lk.ijse.gdse.hibernate.embaded.MobileNumber;
import lk.ijse.gdse.hibernate.entity.Customer;
import lk.ijse.gdse.hibernate.repository.CustomerRepository;
import lk.ijse.gdse.hibernate.util.SessionFactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class AppInitializer {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepository();
       Customer customer = getCustomerEntity();
       customerRepository.saveCustomer(customer);
       /* Customer customer = new Customer();
        customer.setId(1);
        *//*customer.setName("janith");
        customer.setAddress("Galle");
        customer.setSalary(45000.00);*//*

        CustName custName= new CustName();
        custName.setFirstName("Janith");
        custName.setMiddleName("Induwara");
        custName.setFirstName("Nanayakkara");

        customer.setName(custName);
        customer.setAddress("Ahanagama");
        customer.setSalary(50000.00);

        List<MobileNumber>phonNumbers=new ArrayList<>();
        phonNumbers.add(new MobileNumber("DILOGE","0760904402"));
        phonNumbers.add(new MobileNumber("MOBILET","07123456790"));
        customer.setPhoneNo(phonNumbers);
        Session session = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();*/
    }
        private static Customer getCustomerEntity() {
            Customer customer = new Customer();
            customer.setId(1);
            CustName custName = new CustName();
            custName.setFirstName("Janith");
            custName.setMiddleName("Induwara");
            custName.setFirstName("Nanayakkara");

            customer.setName(custName);
            customer.setAddress("Ahanagama");
            customer.setSalary(50000.00);

            List<MobileNumber> phonNumbers = new ArrayList<>();
            phonNumbers.add(new MobileNumber("DILOGE", "0760904402"));
            phonNumbers.add(new MobileNumber("MOBILET", "07123456790"));

            return customer;

    }
}
