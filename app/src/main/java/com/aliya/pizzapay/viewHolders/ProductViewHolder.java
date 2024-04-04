package com.aliya.pizzapay.viewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.aliya.pizzapay.R;


public class ProductViewHolder extends RecyclerView.ViewHolder {
    public TextView title;
    public TextView details;
    public TextView date;

    public LinearLayout post;
    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);
        title=itemView.findViewById(R.id.title);
        details =itemView.findViewById(R.id.details);
        date=itemView.findViewById(R.id.date);
        post=itemView.findViewById(R.id.post);
    }
}
