package com.example.myapplication.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.home.HomeActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void moveToLogin(View view) {
        Intent login = new Intent(this, MainActivity.class);
        startActivity(login);
    }

    public void register(View view) {

        EditText usernameText = (EditText) findViewById(R.id.Username);
        EditText passwordText = (EditText) findViewById(R.id.Password);

        String username = usernameText.getText().toString();
        String password = passwordText.getText().toString();

        Intent register = new Intent(this, HomeActivity.class);
        register.putExtra("username", username);
        register.putExtra("password", password);
        startActivity(register);
    }
}

