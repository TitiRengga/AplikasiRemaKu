package com.example.remaku;

import java.io.Serializable;

public class FoodDomain implements Serializable{
    private String title;
    private String picture;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FoodDomain (String title, String picture, String description){
        this.title = title;
        this.picture = picture;
        this.description = description;
    }

}
