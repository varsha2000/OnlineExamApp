package com.example.onlineexamapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        if (getSupportActionBar() != null)  //remove top actionbar
        {
            getSupportActionBar().hide();
        }

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        btn6 = findViewById(R.id.btn6);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(home.this,"Welcome to c language test",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(home.this,c.class));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(home.this,"Welcome to c plus plus language test",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(home.this,cpp.class));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(home.this,"Welcome to java test",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(home.this,java.class));
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(home.this,"Welcome to python test",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(home.this,python.class));
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(home.this,"Successful Log Out",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),Login.class));
            }
        });
    }

}