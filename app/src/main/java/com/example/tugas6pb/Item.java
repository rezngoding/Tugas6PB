package com.example.tugas6pb;

public class Item {

    private String name;
    private String description;
    private String price;
    private int imageResource;
    private String additionalDetail;

    public Item(String name, String description, int imageResource) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageResource = imageResource;
        this.additionalDetail = additionalDetail;
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getImageResource() {
        return imageResource;
    }
    public String getAdditionalDetail(){
        return additionalDetail;
    }
}

