package com.example.student.sharedpreferncelogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.widget.EditText;
import android.content.SharedPreferences;
import android.content.Intent;


public class login extends AppCompatActivity {
    EditText login, password;
    Button btnll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = (EditText) findViewById(R.id.ld1);
        password = (EditText) findViewById(R.id.pd1);
        btnll = (Button) findViewById(R.id.button2);

        btnll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences sharedPreferences=getSharedPreferences("MySharedPrefs",MODE_PRIVATE);
                String newUser=login.getText().toString();
                String newPass=password.getText().toString();


                SharedPreferences.Editor editor= sharedPreferences.edit();
                editor.putString(newUser + newPass + "data","Username : "+newUser + "\n" + "Password : "+newPass);

                editor.commit();


                Toast.makeText(getApplicationContext(),"Successfully Registered.",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(login.this,view.class);

                startActivity(intent);
            }
        });
    }
}
