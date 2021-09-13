package com.example.myapplication.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        String password = intent.getStringExtra("password");

        TextView usernameTV = (TextView) findViewById(R.id.UsernameTextView);
        TextView passwordTV = (TextView) findViewById(R.id.PasswordTextView);

        usernameTV.setText(username);
        passwordTV.setText(password);

    }
}