package com.business.world.entity;

import javax.persistence.*;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@javax.persistence.Table(name="EMPLOYEE")
public class EmployeeEntity implements Serializable{
    private int id;
    private String employeeId;
    private String firstname;
    private String lastname;
    private int salary;
    private AddressEntity address;

    @Id
    @GeneratedValue
    @Column(name ="ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Column(name="EMPLOYEE_ID")
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Column(name="FIRST_NAME")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Column(name="LAST_NAME")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Column(name="SALARY")
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name="ADDRESS_ID")
    @JoinColumn(name = "ADDRESS_ID", referencedColumnName = "ID")
    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "employeeId='" + employeeId + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }
}
