package com.example.rayold.everydayneeds;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.rayold.everydayneeds.activities.Login;

public class searchChoice extends AppCompatActivity {
    Button name, service,logg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choice);
        name = (Button) findViewById(R.id.searchName);
        service = (Button) findViewById(R.id.searchService);
        logg = (Button) findViewById(R.id.button5);
        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(searchChoice.this, nameList.class);
                startActivity(i);
            }
        });
        service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(searchChoice.this, ServiceList2.class);
                startActivity(i);
            }
        });

        logg.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
                Intent i = new Intent(searchChoice.this, Login.class);
                startActivity(i);
            }
        });

    }
}
