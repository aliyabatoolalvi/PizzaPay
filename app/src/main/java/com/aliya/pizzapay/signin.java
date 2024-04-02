package com.aliya.pizzapay;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
//import android.widget.TextView.setPaintFlags;

public class signin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signin);
        findViewById(R.id.login).setOnClickListener(v->{
//            Intent intent =new Intent();
            startActivity(new Intent(this, signin.class));
            finish();

        });
//        findViewById(R.id.login).setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
    }
}