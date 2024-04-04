package com.aliya.pizzapay.adapter;

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

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product Product = data.get(position);
        holder.title.setText(Product.getName());

        holder.details.setText(Product.getDetails());
        holder.date.setText(Product.getCreatedAt());
//        holder.fvt.setImageResource(Product.isFvt()?R.drawable.star_filled:R.drawable.star_empty);
    }
    @Override
    public int getItemCount() {
        return data.size();
    }
}
