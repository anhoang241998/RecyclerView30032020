package com.example.recyclerviewkhoapham30032020;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.recyclerviewkhoapham30032020.models.Food;

public class FoodDetailActivity extends AppCompatActivity {

    public static final String FOOD_DETAIL = "com.example.recyclerviewkhoapham30032020.FOOD_DETAIL";

    private Intent mIntent;
    private int mImage;
    private String mNameOfTheFood, mPrice, mAddress;
    private Food mFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);

        mIntent = getIntent();
        mFood = mIntent.getParcelableExtra(FOOD_DETAIL);

        mImage = mFood.getImage();
        mNameOfTheFood = mFood.getNameOfTheFood();
        mPrice = mFood.getPrice();
        mAddress = mFood.getAddress();

        ImageView imageView = findViewById(R.id.food_picture);
        TextView foodName = findViewById(R.id.item_food_name);
        TextView foodPrice = findViewById(R.id.item_food_price);
        TextView address = findViewById(R.id.item_food_address);
        imageView.setImageResource(mImage);
        foodName.setText(mNameOfTheFood);
        foodPrice.setText(mPrice);
        address.setText(mAddress);



    }
}
