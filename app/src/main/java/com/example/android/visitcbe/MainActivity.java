package com.example.android.visitcbe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the View that shows the temples category
        TextView temples = (TextView) findViewById(R.id.temple);

        // Set a click listener on that View
        temples.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent templesIntent = new Intent(MainActivity.this, TempleActivity.class);
                startActivity(templesIntent);
            }
        });
        // Find the View that shows the numbers category
        TextView food = (TextView) findViewById(R.id.food);

        // Set a click listener on that View
        food.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent foodsIntent = new Intent(MainActivity.this, FoodActivity.class);
                startActivity(foodsIntent);
            }
        });
        // Find the View that shows the numbers category
        TextView college = (TextView) findViewById(R.id.college);

        // Set a click listener on that View
        college.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent collegeIntent = new Intent(MainActivity.this, CollegeActivity.class);
                startActivity(collegeIntent);
            }
        });
        // Find the View that shows the numbers category
        TextView touristPlaces = (TextView) findViewById(R.id.touristPlaces);

        // Set a click listener on that View
        touristPlaces.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent touristsPlacesIntent = new Intent(MainActivity.this, TouristsplacesActivity.class);
                startActivity(touristsPlacesIntent);
            }
        });

    }
}


