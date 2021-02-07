package com.springboot.restuarant.Table4U.entity;

import javax.persistence.*;

@Entity
public class BookingTableCustomer {

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookingId;



}
