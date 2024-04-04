package com.aliya.pizzapay;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.aliya.pizzapay.adapter.ProductAdapter;
import com.aliya.pizzapay.data.Product;
import com.aliya.pizzapay.databinding.ActivityMainBinding;
import com.aliya.pizzapay.room.AppDatabase;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    RecyclerView recyclerView;
    ProductAdapter adapter;
    List<Product> data = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        adapter = new ProductAdapter(this, data);
        binding.recycler.setLayoutManager(new LinearLayoutManager(this));
        binding.recycler.setAdapter(adapter);

        List<Product> products = AppDatabase.getDatabase(this).productDao().getAll();
//        data.clear();
        data.addAll(products);
        adapter.notifyDataSetChanged();

    }
}