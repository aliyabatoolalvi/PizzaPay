package com.aliya.pizzapay;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_welcome);
        findViewById(R.id.create_account).setOnClickListener(v->{
//            Intent intent =new Intent();
            startActivity(new Intent(this, signin.class));
            finish();
        });
        findViewById(R.id.login).setOnClickListener(v->{
//            Intent intent =new Intent();
            startActivity(new Intent(this, login.class));
            finish();
        });
    }
}