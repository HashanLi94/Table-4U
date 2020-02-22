package com.springboot.restuarant.Table4U.entity;

import javax.persistence.*;

@Entity
@Table
public class Images {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int imageId;

    @Column
    private String image;


    public Images() {
    }

    //getters and setters

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    //toString

    @Override
    public String toString() {
        return "Images{" +
                "imageId=" + imageId +
                ", image='" + image + '\'' +
                '}';
    }
}
