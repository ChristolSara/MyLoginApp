package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = findViewById(R.id.username);
        TextView password =findViewById(R.id.password);
        MaterialButton loginbtn =findViewById(R.id.loginbtn);

        //admin and admin
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){

                    Toast.makeText(MainActivity.this,"LOGIN Successefull",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,"LOGIN FAILED !!",Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
}