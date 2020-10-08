package com.example.bossboss;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    EditText txtusername;
    EditText txtpassword;
    Button btnLogin;
    Button btnregister;
    CheckBox remember;
    TextView forgot;
    TextView attempts;
    int counter=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtusername = (EditText) findViewById(R.id.txtusername);
        txtpassword = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.btnsign);
        forgot = (TextView) findViewById(R.id.forgot);
        remember = (CheckBox) findViewById(R.id.remember);
        btnregister = (Button) findViewById(R.id.btnregister);
        attempts = (TextView) findViewById(R.id.attempts);



        btnLogin .setOnClickListener(new View.OnClickListener(){
        @Override
            public void onClick(View view) {
                if(txtusername.getText().toString().equals("BOSS") &&
                        txtpassword.getText().toString().equals("12345")) {
                    Intent intent=new Intent(MainActivity.this,Homescreen.class);
                    startActivity(intent);

                }else{
                    Toast.makeText(getApplicationContext(), "Please try again",Toast.LENGTH_SHORT).show();

                    //not backtrack in previous class
                    finish();

                    counter--;
                    txtusername.setText(Integer.toString(counter));

                    if (counter == 0) {
                        btnLogin.setEnabled(false);
                    }
                }
            }
        });

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, registerActivity.class);
                startActivity(intent);

                finish();
            }
        });

        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, forgotpasswordscreen.class);
                startActivity(intent);

                finish();
            }
        });


    }
}





