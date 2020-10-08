package com.example.bossboss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class registerActivity extends AppCompatActivity {

    EditText txtname;
    EditText password;
    EditText confirmpassword;
    EditText mobile;
    EditText email;
    Button btnsign;
    CheckBox remwmber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registeractivity);

        txtname = (EditText) findViewById(R.id.txtname);
        password = (EditText) findViewById(R.id.password);
        btnsign = (Button) findViewById(R.id.btnsign);
        confirmpassword = (EditText) findViewById(R.id.confirmpassword);
        remwmber = (CheckBox) findViewById(R.id.remember);
        mobile = (EditText) findViewById(R.id.mobile);
        email = (EditText) findViewById(R.id.email);















    }
}
