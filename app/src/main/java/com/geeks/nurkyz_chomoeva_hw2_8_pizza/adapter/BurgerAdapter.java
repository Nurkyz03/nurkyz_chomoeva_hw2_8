package com.geeks.nurkyz_chomoeva_hw2_8_pizza.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geeks.nurkyz_chomoeva_hw2_8_pizza.Burger;
import com.geeks.nurkyz_chomoeva_hw2_8_pizza.R;

import java.util.List;

public class BurgerAdapter extends RecyclerView.Adapter<BurgerAdapter.BurgerViewHolder> {

    private List<Burger> burgerList;

    public BurgerAdapter(List<Burger> burgerList) {
        this.burgerList = burgerList;
    }

    @Override
    public BurgerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_burgers, parent, false);
        return new BurgerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BurgerViewHolder holder, int position) {
        Burger burger = burgerList.get(position);
        holder.nameTextView.setText(burger.getName());
        holder.priceTextView.setText(String.format("$%.2f", burger.getPrice()));
    }

    @Override
    public int getItemCount() {
        return burgerList.size();
    }

    public static class BurgerViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        TextView priceTextView;

        public BurgerViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.burgers_text);
            priceTextView = itemView.findViewById(R.id.burgers_cost);
        }
    }
}
