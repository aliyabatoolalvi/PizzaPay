package com.aliya.pizzapay;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findViewById(R.id.register).setOnClickListener(v->{
            startActivity(new Intent(this, signin.class));
            finish();
        });

        findViewById(R.id.loginBtn).setOnClickListener(v->{
            startActivity(new Intent(this, MainActivity.class));
            finish();

        });
    }
}