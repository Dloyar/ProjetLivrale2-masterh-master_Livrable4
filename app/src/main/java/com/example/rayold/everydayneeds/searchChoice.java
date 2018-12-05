package com.example.rayold.everydayneeds;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
public class searchChoice extends AppCompatActivity {
    Button name, service;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choice);
        name = (Button) findViewById(R.id.searchName);
        service = (Button) findViewById(R.id.searchService);
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
    }
}
