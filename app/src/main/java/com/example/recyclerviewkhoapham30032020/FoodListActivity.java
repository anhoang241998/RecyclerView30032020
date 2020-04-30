package com.example.recyclerviewkhoapham30032020;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewkhoapham30032020.adapters.FoodRecyclerAdapter;
import com.example.recyclerviewkhoapham30032020.models.Food;

import java.util.ArrayList;

public class FoodListActivity extends AppCompatActivity {

    //UI components
    private RecyclerView mRecyclerView;

    //vars
    private ArrayList<Food> mFoods = new ArrayList<>();
    private FoodRecyclerAdapter mFoodRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);

        mRecyclerView = findViewById(R.id.recyclerview);
        initRecyclerView();
        insertFoodList();

    }

    private void insertFoodList() {
        mFoods.add(new Food(R.drawable.hinh_mon_banh_khot, "Bánh Khọt", "20 000 VND", "TP.HCM"));
        mFoods.add(new Food(R.drawable.hinh_mon_banh_my, "Bánh Mỳ", "10 000 VND", "TP.HCM"));
        mFoods.add(new Food(R.drawable.hinh_mon_bi_ngoi_chien_xu, "Bí Ngòi Chiên Xù", "35 000 VND", "TP.HCM"));
        mFoods.add(new Food(R.drawable.hinh_mon_bun_mam, "Bún Mắm", "25 000 VND", "TP.HCM"));
        mFoods.add(new Food(R.drawable.hinh_mon_bun_rieu, "Bún Riêu", "22 000 VND", "TP.HCM"));
        mFoods.add(new Food(R.drawable.hinh_mon_muc, "Mực", "20 000 VND", "TP.HCM"));
        mFoodRecyclerAdapter.notifyDataSetChanged();
    }

    private void initRecyclerView() {
        Context context;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mFoodRecyclerAdapter = new FoodRecyclerAdapter(mFoods);
        mRecyclerView.setAdapter(mFoodRecyclerAdapter);

    }
}
