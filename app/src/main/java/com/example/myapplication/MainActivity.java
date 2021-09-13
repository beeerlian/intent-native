package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.home.HomeActivity;
import com.example.myapplication.registration.RegisterActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) this.findViewById(R.id.click_to_register);
    }

    public void moveToRegister(View v) {
        Intent register = new Intent(this, RegisterActivity.class);
        startActivity(register);
    }
    public void login(View v) {
        EditText usernameText = (EditText) findViewById(R.id.Username);
        EditText passwordText = (EditText) findViewById(R.id.Password);

        String username = usernameText.getText().toString();
        String password = passwordText.getText().toString();

        Intent login = new Intent(this, HomeActivity.class);
        login.putExtra("username", username);
        login.putExtra("password", password);
        startActivity(login);
    }

}