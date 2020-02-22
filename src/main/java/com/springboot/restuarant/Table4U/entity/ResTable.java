package com.springboot.restuarant.Table4U.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class ResTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int tableNumber;

    @Column
    private int maxCountPax;

    @Column
    private double decoPrice;

    @OneToMany
    List<Image> imageList;

    @ManyToMany(mappedBy = "bookingTables")
    @JsonIgnore
    List<Booking> bookingList;

    public ResTable() {
    }

    //getters and setters for mapping


    public List<Image> getImageList() {
        return imageList;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getMaxCountPax() {
        return maxCountPax;
    }

    public void setMaxCountPax(int maxCountPax) {
        this.maxCountPax = maxCountPax;
    }

    public double getDecoPrice() {
        return decoPrice;
    }

    public void setDecoPrice(double decoPrice) {
        this.decoPrice = decoPrice;
    }

    @Override
    public String toString() {
        return "ResTable{" +
                "tableNumber=" + tableNumber +
                ", maxCountPax=" + maxCountPax +
                ", decoPrice=" + decoPrice +
                '}';
    }
}
