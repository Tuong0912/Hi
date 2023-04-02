package com.example.minitest.model;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;

@Table
@Entity
public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int pictureCode;
    private double height;
    private double width;
    private String type;
    private String note;
    private double price;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


    public Picture() {
    }

    public Picture(int pictureCode, double height, double width, String type, String note, double price, Category category) {
        this.pictureCode = pictureCode;
        this.height = height;
        this.width = width;
        this.type = type;
        this.note = note;
        this.price = price;
        this.category = category;
    }

    public Picture(Long id, int pictureCode, double height, double width, String type, String note, double price, Category category) {
        this.id = id;
        this.pictureCode = pictureCode;
        this.height = height;
        this.width = width;
        this.type = type;
        this.note = note;
        this.price = price;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPictureCode() {
        return pictureCode;
    }

    public void setPictureCode(int idPicture) {
        this.pictureCode = idPicture;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
