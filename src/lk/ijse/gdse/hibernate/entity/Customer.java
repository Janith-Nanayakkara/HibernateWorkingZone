package lk.ijse.gdse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    private long id;
    private String name;
    private String Address;
    private double salary;

    public Customer(long id, String name, String address, double salary) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
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
}
