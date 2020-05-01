package com.example.recyclerviewkhoapham30032020.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Food implements Parcelable {
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

    protected Food(Parcel in) {
        mImage = in.readInt();
        mNameOfTheFood = in.readString();
        mPrice = in.readString();
        mAddress = in.readString();
    }

    public static final Creator<Food> CREATOR = new Creator<Food>() {
        @Override
        public Food createFromParcel(Parcel in) {
            return new Food(in);
        }

        @Override
        public Food[] newArray(int size) {
            return new Food[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mImage);
        dest.writeString(mNameOfTheFood);
        dest.writeString(mPrice);
        dest.writeString(mAddress);
    }
}
