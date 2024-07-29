package com.geeks.nurkyz_chomoeva_hw2_8_pizza;

public class Category {

    private final int imageResId;
    private final String text;

    public Category(int imageResId, String text) {
        this.imageResId = imageResId;
        this.text = text;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getText() {
        return text;
    }
}
