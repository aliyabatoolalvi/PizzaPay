package com.aliya.pizzapay;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

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
import com.aliya.pizzapay.retrofit.APIClient;
import com.aliya.pizzapay.retrofit.APIInterface;
import com.aliya.pizzapay.room.AppDatabase;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
        LinearLayoutManager manager=new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        binding.recycler.setLayoutManager(manager);
        binding.recycler.setAdapter(adapter);

        List<Product> products = AppDatabase.getDatabase(this).productDao().getAll();

        APIInterface apiInterface = APIClient.getClient().create(APIInterface.class);
        Call<List<Product>> call1 = apiInterface.loadProducts();
        call1.enqueue(new Callback<List<Product>>() {
            @Override
            public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
//                if (response.code() == 200) {
//                    List<Product> products = response.body();
//                    AppDatabase.getDatabase(MainActivity.this).productDao().deleteAll();
//                    AppDatabase.getDatabase(MainActivity.this).productDao().insertOrReplaceAll(products);
//                    Toast.makeText(MainActivity.this, "Success: "+products.size(), Toast.LENGTH_SHORT).show();
//                    refresh();
//                } else {
//                    Toast.makeText(MainActivity.this, "Error: "+response.message(), Toast.LENGTH_SHORT).show();
//                };
                if (response.isSuccessful()) {
                    List<Product> products = response.body();
                    Log.d("API Response", "Success: " + products.size());

                    AppDatabase.getDatabase(MainActivity.this).productDao().deleteAll();
                    AppDatabase.getDatabase(MainActivity.this).productDao().insertOrReplaceAll(products);
                    Toast.makeText(MainActivity.this, "Success: "+products.size(), Toast.LENGTH_SHORT).show();
                    refresh();
                } else {
                    Log.e("API Response", "Error: " + response.code() + " " + response.message());
                    Toast.makeText(MainActivity.this, "Error: "+response.message(), Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<List<Product>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error: "+t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void refresh(){
        data.clear();
        data.addAll(AppDatabase.getDatabase(this).productDao().getAll());
        adapter.notifyDataSetChanged();
    }


}
