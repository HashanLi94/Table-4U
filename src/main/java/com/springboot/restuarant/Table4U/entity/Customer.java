package com.springboot.restuarant.Table4U.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Customer {
    @Id
    @Column
    private int customerId;

    @Column
    private String firstName;

    @Column
    private String lastNAme;

    @Column
    private String email;

    @Column
    private String contactNumber;

    @Column
    private int nic;



    public Customer() {
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNAme() {
        return lastNAme;
    }

    public void setLastNAme(String lastNAme) {
        this.lastNAme = lastNAme;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int getNic() {
        return nic;
    }

    public void setNic(int nic) {
        this.nic = nic;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastNAme='" + lastNAme + '\'' +
                ", email='" + email + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", nic=" + nic +
                '}';
    }
}
