package com.example.recyclerviewkhoapham30032020.models;

public class Food {
    private int mImage;
    private String mNameOfTheFood, mPrice, mAddress;

    public Food(int image, String nameOfTheFood, String price, String address) {
        mImage = image;
        mNameOfTheFood = nameOfTheFood;
        mPrice = price;
        mAddress = address;
    }

    public Food() {
    }

    public int getImage() {
        return mImage;
    }

    public void setImage(int image) {
        mImage = image;
    }

    public String getNameOfTheFood() {
        return mNameOfTheFood;
    }

    public void setNameOfTheFood(String nameOfTheFood) {
        mNameOfTheFood = nameOfTheFood;
    }

    public String getPrice() {
        return mPrice;
    }

    public void setPrice(String price) {
        mPrice = price;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    @Override
    public String toString() {
        return "Food{" +
                "mImage=" + mImage +
                ", mNameOfTheFood='" + mNameOfTheFood + '\'' +
                ", mPrice='" + mPrice + '\'' +
                ", mAddress='" + mAddress + '\'' +
                '}';
    }
}
