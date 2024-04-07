package com.aliya.pizzapay.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aliya.pizzapay.R;
import com.aliya.pizzapay.data.Product;

import com.aliya.pizzapay.room.AppDatabase;
import com.aliya.pizzapay.viewHolders.ProductViewHolder;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder> {

    Context context;
    List<Product> data;
    public ProductAdapter(Context context, List<Product> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_note,parent,false);
        return new ProductViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product Product = data.get(position);

//        holder.itemimg.setImageResource(Product.getImg());
        holder.title.setText(Product.getName());

        holder.details.setText(Product.getDetails());
        holder.price.setText(Product.getPrice() + " Rs");
        holder.add.setImageResource(R.drawable.baseline_add_shopping_cart_24);
        Picasso.get().load("http://192.168.137.1/pizzapay/api/" + Product.getImg()).into(holder.itemimg);

    }
    @Override
    public int getItemCount() {
        return data.size();
    }
}
