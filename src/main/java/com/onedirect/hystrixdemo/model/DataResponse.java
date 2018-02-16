package com.onedirect.hystrixdemo.model;

import java.io.Serializable;

public class DataResponse implements Serializable {

    private Long id;

    private String description;

    private boolean isSold;

    private int price;

    public DataResponse() {
    }

    public DataResponse(Long id, String description, boolean isSold, int price) {
        this.id = id;
        this.description = description;
        this.isSold = isSold;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
