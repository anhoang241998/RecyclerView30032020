package com.example.recyclerviewkhoapham30032020.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewkhoapham30032020.Interfaces.OnItemClickListener;
import com.example.recyclerviewkhoapham30032020.R;
import com.example.recyclerviewkhoapham30032020.models.Food;

import java.util.ArrayList;

public class FoodRecyclerAdapter extends RecyclerView.Adapter<FoodRecyclerAdapter.ViewHolder> {
    private ArrayList<Food> mFoods;
    private OnItemClickListener mListener;

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    public FoodRecyclerAdapter(ArrayList<Food> foods) {
        this.mFoods = foods;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_food_list_item, parent, false);
        return new ViewHolder(view, mListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.foodPicture.setImageResource(mFoods.get(position).getImage());
        holder.nameOfTheFood.setText(mFoods.get(position).getNameOfTheFood());
        holder.price.setText(mFoods.get(position).getPrice());
        holder.address.setText(mFoods.get(position).getAddress());
    }

    @Override
    public int getItemCount() {
        return mFoods.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameOfTheFood, price, address;
        ImageView foodPicture;


        public ViewHolder(@NonNull View itemView, final OnItemClickListener listener) {
            super(itemView);

            foodPicture = itemView.findViewById(R.id.image1);
            nameOfTheFood = itemView.findViewById(R.id.food_name);
            price = itemView.findViewById(R.id.food_price);
            address = itemView.findViewById(R.id.address);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }
}
