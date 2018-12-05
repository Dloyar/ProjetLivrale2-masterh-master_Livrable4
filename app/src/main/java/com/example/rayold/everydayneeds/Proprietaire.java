package com.example.rayold.everydayneeds;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.rayold.everydayneeds.activities.DatabaseHelper;
import com.example.rayold.everydayneeds.activities.User;

public class Proprietaire extends AppCompatActivity {
    DatabaseHelper db;
    TextView service, cost;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proprietaire);
        cost = (TextView) findViewById(R.id.serviceName);
        service = (TextView) findViewById(R.id.serviceCost);
        add = (Button) findViewById(R.id.buttonAdd);
        //service.setText(db.getService().toString());
        //cost.setText(db.getHourlyRate(db.getService().toString()).toString());
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {






            }
    });}

}
