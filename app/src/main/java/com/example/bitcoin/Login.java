package com.example.bitcoin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class Login extends AppCompatActivity {
EditText editText_name,editText_email,editText_password;
Button loginbtn;
ImageButton backbutton;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editText_name=findViewById(R.id.fname);
        editText_email=findViewById(R.id.emile);
        editText_password=findViewById(R.id.password);
        loginbtn=findViewById(R.id.loginbtn);
         backbutton=findViewById(R.id.backbtn);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}