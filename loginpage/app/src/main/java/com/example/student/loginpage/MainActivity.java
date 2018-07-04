package com.example.student.loginpage;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=(TextView)findViewById(R.id.withText);
Bundle b=getIntent().getExtras();
String user=b.getString("User");
String pass=b.getString("Password");
if(user.equals("ADMIN")&& pass.equals("12345"))
    t.setText("Welcome " + "user" + "\n\n you logged in sucessfully");
else
    t.setText("wrong.username & password");
        }
    }

