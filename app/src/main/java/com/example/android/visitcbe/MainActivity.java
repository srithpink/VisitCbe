package com.example.android.visitcbe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //Using intent to move from main acticity to clicked acticity
    public void openTempleList(View view) {
        Intent i = new Intent(this, TempleActivity.class);
        startActivity(i);
    }
    public void openFoodList(View view) {
        Intent i = new Intent(this, FoodActivity.class);
        startActivity(i);
    }
    public void openCollegeList(View view) {
        Intent i = new Intent(this, CollegeActivity.class);
        startActivity(i);
    }
    public void openTouristPlacesList(View view) {
        Intent i = new Intent(this, TouristsplacesActivity.class);
        startActivity(i);
    }
}
