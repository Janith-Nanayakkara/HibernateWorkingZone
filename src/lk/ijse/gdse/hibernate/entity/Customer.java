package lk.ijse.gdse.hibernate.entity;

import lk.ijse.gdse.hibernate.embaded.CustName;
import lk.ijse.gdse.hibernate.embaded.MobileNumber;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private long id;
    @Column(name = "customer_name")
    private CustName name;
    @Column(name = "customer_address")
    private String Address;
    @Column(name = "customer_salary")
    private double salary;
    @Column(name = "customer_age",columnDefinition = "SMALLINT")
    private int age;
    @CollectionTable(name = "customer_mobile_Number",
    joinColumns = @JoinColumn(name = "customer_id"))
    private List<MobileNumber>phoneNo;

    public Customer(long id, CustName name, String address, double salary, int age, List<MobileNumber> phoneNo) {
        this.id = id;
        this.name = name;
        Address = address;
        this.salary = salary;
        this.setAge(age);
        this.phoneNo = phoneNo;
    }

    public Customer(long id, CustName name, String address, double salary) {
        this.setId(id);
        this.setName(name);
        setAddress(address);
        this.setSalary(salary);
    }

    public Customer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CustName getName() {
        return name;
    }

    public void setName(CustName name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
