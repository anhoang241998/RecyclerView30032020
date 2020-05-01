package com.example.recyclerviewkhoapham30032020;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.recyclerviewkhoapham30032020.Interfaces.OnItemClickListener;
import com.example.recyclerviewkhoapham30032020.adapters.FoodRecyclerAdapter;
import com.example.recyclerviewkhoapham30032020.models.Food;

import java.util.ArrayList;

public class FoodListActivity extends AppCompatActivity {

    //UI components
    private RecyclerView mRecyclerView;
    private SwipeRefreshLayout mSwipeRefreshLayout;


    //vars
    private ArrayList<Food> mFoods = new ArrayList<>();
    private FoodRecyclerAdapter mFoodRecyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);

        mRecyclerView = findViewById(R.id.recyclerview);
        mSwipeRefreshLayout = findViewById(R.id.swipeRefresh);
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

        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mFoods.add(new Food(R.drawable.hinh_mon_banh_khot, "Bánh Khọt", "20 000 VND", "TP.HCM"));
                mFoods.add(new Food(R.drawable.hinh_mon_banh_my, "Bánh Mỳ", "10 000 VND", "TP.HCM"));
                mFoods.add(new Food(R.drawable.hinh_mon_bi_ngoi_chien_xu, "Bí Ngòi Chiên Xù", "35 000 VND", "TP.HCM"));
                mFoods.add(new Food(R.drawable.hinh_mon_bun_mam, "Bún Mắm", "25 000 VND", "TP.HCM"));
                mFoods.add(new Food(R.drawable.hinh_mon_bun_rieu, "Bún Riêu", "22 000 VND", "TP.HCM"));
                mFoods.add(new Food(R.drawable.hinh_mon_muc, "Mực", "20 000 VND", "TP.HCM"));
                mFoodRecyclerAdapter.notifyDataSetChanged();
                mSwipeRefreshLayout.setRefreshing(false);
            }
        });

    }

    private void initRecyclerView() {
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mFoodRecyclerAdapter = new FoodRecyclerAdapter(mFoods);
        mRecyclerView.setAdapter(mFoodRecyclerAdapter);
        mFoodRecyclerAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(FoodListActivity.this, FoodDetailActivity.class);
                intent.putExtra(FoodDetailActivity.FOOD_DETAIL, mFoods.get(position));
                startActivity(intent);
            }
        });
    }

}
