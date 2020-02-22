package com.springboot.restuarant.Table4U.entity;


import javax.persistence.*;

@Entity
@Table
public class AdminTableManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int tableNumber;

    @Column
    private int numberOfSeats;

    @Column
    private int imgId;

    public AdminTableManagement() {
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    @Override
    public String toString() {
        return "AdminTableManagement{" +
                "tableNumber=" + tableNumber +
                ", numberOfSeats=" + numberOfSeats +
                ", imgId=" + imgId +
                '}';
    }
}
