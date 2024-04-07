package com.aliya.pizzapay.viewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.aliya.pizzapay.R;


public class ProductViewHolder extends RecyclerView.ViewHolder {
    public TextView title;
    public TextView details;
    public TextView price;
    public ImageView itemimg;

    public ImageView add;
    public ConstraintLayout post;
    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);

        title=itemView.findViewById(R.id.title);
        details =itemView.findViewById(R.id.details);
        itemimg= itemView.findViewById(R.id.itemimg);
        price=itemView.findViewById(R.id.price);
        post=itemView.findViewById(R.id.post);
        add= itemView.findViewById(R.id.imageView4);
    }
}
