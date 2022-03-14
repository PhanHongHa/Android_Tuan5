package com.example.tuan5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvDonut;
    DonutAdapter donutAdapter;
    ArrayList<Donut> donuts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvDonut = (ListView) findViewById(R.id.listViewDonut);
        donuts = new ArrayList<>();

        donuts.add(new Donut("Tasty Donut", "Spicy tasty donut family","$10.00",R.drawable.donut_yellow_1));
        donuts.add(new Donut("Pink Donut", "Spicy tasty donut family","$20.00",R.drawable.tasty_donut_1));
        donuts.add(new Donut("Floating Donut", "Spicy tasty donut family","$30.00",R.drawable.green_donut_1));
        donuts.add(new Donut("Tasty Donut", "Spicy tasty donut family","$40.00",R.drawable.donut_red_1));

        donutAdapter = new DonutAdapter(this,R.layout.custom_layout, donuts);
        lvDonut.setAdapter(donutAdapter);
    }
}