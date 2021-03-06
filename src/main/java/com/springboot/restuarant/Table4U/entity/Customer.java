package com.springboot.restuarant.Table4U.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Customer {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String address;


    @Column
    private String email;

    @Column
    private String contactNumber;

    @Column
    private String nic;

    @Column
    private String additionalNotes;

//    @OneToOne(mappedBy = "customer")
//    private Booking booking;

//    @OneToOne(mappedBy = "customer")
//    @JsonIgnore
//    private Booking bookingRes;

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAdditionalNotes() {
        return additionalNotes;
    }

    public void setAdditionalNotes(String additionalNotes) {
        this.additionalNotes = additionalNotes;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", nic='" + nic + '\'' +
                ", additionalNotes='" + additionalNotes + '\'' +
                '}';
    }


}






