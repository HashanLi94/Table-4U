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
    private int status;

    @Column
    private int price;

    @ManyToMany
    public List<ResTable> bookingTables;



    //constructor
    public Booking() {
    }

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





    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

                ", status='" + status + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                '}';
    }
}
