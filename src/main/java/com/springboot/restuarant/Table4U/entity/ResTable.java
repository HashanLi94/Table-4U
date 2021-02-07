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

    @Column
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @OneToMany
    List<Image> imageList;


   /* @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booking_id")
    //@JsonIgnore
    private Booking booking;*/

//    example
//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "post_id")
//    private Post post;

//    @ManyToMany(mappedBy = "bookingTables")
//    @JsonIgnore
//    List<Booking> bookingList;

    public ResTable() {
    }

    //getters and setters for mapping


    public List<Image> getImageList() {
        return imageList;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }

    @Override
    public String toString() {
        return "ResTable{" +
                "tableNumber=" + tableNumber +
                ", maxCountPax=" + maxCountPax +
                ", decoPrice=" + decoPrice +
                ", price=" + price +
                ", imageList=" + imageList +
                ", booking=" +
                '}';
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

}
