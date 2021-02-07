package com.springboot.restuarant.Table4U.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Booking {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookingId;

    @Column
    private int paxCount;

    @Column
    private String date;

    @Column
    private String time;

    @Column
    private int statusId;

    @Column
    private int price;

    public void setResTableId(int resTableId) {
        this.resTableId = resTableId;
    }

    public int getResTableId() {
        return resTableId;
    }

    @Column
    private int resTableId;

//    @ManyToMany(fetch = FetchType.LAZY)
//    public List<ResTable> bookingTables;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    //@JsonIgnore
    @JoinColumn(name = "customer_id")
    private Customer customer;

    /*@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    //@JsonIgnore
    @JoinColumn(name = "booking")
    private Customer customer;*/

  /*  @OneToOne(mappedBy = "booking", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    //@JsonIgnore
    private ResTable resTable;*/

    //    example
//    @OneToOne(mappedBy = "post", cascade = CascadeType.ALL,
//            fetch = FetchType.LAZY, optional = false)
//    private PostDetails details;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    //constructor
    public Booking(){}

    //getters n setters
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getPaxCount() {
        return paxCount;
    }
    {
    }
    public void setPaxCount(int paxCount) {
        this.paxCount = paxCount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //toString
    @Override
    public String toString() {
        return "Bookings{" +
                "bookingId=" + bookingId +
                ", paxCount=" + paxCount +
                ", date=" + date +
                ", time=" + time +

                ", statusId='" + statusId + '\'' +
                ", price=" + price +
                ", statusId='" + statusId + '\'' +
                '}';
    }
}
