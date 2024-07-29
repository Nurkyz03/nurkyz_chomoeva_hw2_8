package com.geeks.nurkyz_chomoeva_hw2_8_pizza;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;


import com.geeks.nurkyz_chomoeva_hw2_8_pizza.adapter.BurgerAdapter;
import com.geeks.nurkyz_chomoeva_hw2_8_pizza.adapter.CategoryAdapter;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));


        List<Category> items = Arrays.asList(
                new Category(R.drawable.ic_burger, "Burgers"),
                new Category(R.drawable.ic_pizza, "Pizza"),
                new Category(R.drawable.ic_chicken, "Chicken"),
                new Category(R.drawable.ic_sushi, "Sushi")
        );

        CategoryAdapter adapter = new CategoryAdapter(items);
        recyclerView.setAdapter(adapter);

        RecyclerView burgerRecyclerView = findViewById(R.id.recycler_view2);
        burgerRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        List<Burger> burgerItems = Arrays.asList(
                new Burger("Salad Burger", 12.00, R.drawable.ic_burger2),
                new Burger("Chicken Burger", 15.00, R.drawable.ic_burger2),
                new Burger("Beef Burger", 18.00, R.drawable.ic_burger2),
                new Burger("Chili Burger", 17.00, R.drawable.ic_burger2)
        );

        BurgerAdapter burgerAdapter = new BurgerAdapter(burgerItems);
        burgerRecyclerView.setAdapter(burgerAdapter);
    }
}
