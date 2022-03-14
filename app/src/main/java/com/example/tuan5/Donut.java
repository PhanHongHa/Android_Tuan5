package com.example.tuan5;

public class Donut {
    private String name;
    private String descrip;
    private String price;
    private int picture;

    public String getDescrip() {
        return descrip;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public int getPicture() {
        return picture;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public Donut() {
    }

    public Donut(String name, String descrip, String price, int picture) {
        this.name = name;
        this.descrip = descrip;
        this.price = price;
        this.picture = picture;
    }

}
