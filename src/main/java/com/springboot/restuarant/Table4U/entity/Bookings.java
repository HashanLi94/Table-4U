package com.springboot.restuarant.Table4U.entity;


import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Bookings {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookingId;

    @Column
    private int paxCount;

    @Column
    private Date date;

    @Column
    private Time time;



    @Column
    private int status;

    @Column
    private int price;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable
    public List<ResTable> bookingTables;



    //constructor
    public Bookings() {
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
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
