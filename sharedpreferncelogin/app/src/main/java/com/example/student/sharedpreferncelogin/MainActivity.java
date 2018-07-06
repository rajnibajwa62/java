package com.example.student.sharedpreferncelogin;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.widget.EditText;
import android.content.SharedPreferences;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText firstname,lastname,password,email,phone;
    Button btnr,btnl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstname = (EditText) findViewById(R.id.ed1);
        lastname = (EditText) findViewById(R.id.ed2);
        password = (EditText) findViewById(R.id.ed3);
        email = (EditText) findViewById(R.id.ed4);
        phone = (EditText) findViewById(R.id.ed5);
        btnr = (Button) findViewById(R.id.button);
        btnl = (Button) findViewById(R.id.button3);

        btnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=email.getText().toString();
                String pass=password.getText().toString();

                SharedPreferences sharedPreferences=getSharedPreferences("MySharedPrefs",MODE_PRIVATE);
                String details= sharedPreferences.getString(user + pass + "data"  ,"Username or Password is incorrect" );

                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString("display",details);

                editor.commit();
                Intent i=new Intent(MainActivity.this,login.class);
                startActivity(i);
            }
        });


        btnl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(MainActivity.this,login.class);
                startActivity(i2);
            }
        });

    }


}
