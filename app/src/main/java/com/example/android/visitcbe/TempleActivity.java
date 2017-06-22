package com.example.android.visitcbe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * Created by LENOVO on 21-06-2017.
 */

public class TempleActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temple);

        ArrayList<String> info = new ArrayList<String>();
        info.add("Perur Pateeshwarar Temple");
        info.add("Marudhamalai Murugan Temple");
        info.add("Koniamman Temple");
        info.add("Thandumaariyamman Temple");
        info.add("Eachanaari Vinayagar Temple");
        info.add("Saibaba Temple");
        info.add("Sri A shtaamsha varadha aanjaneyar Temple");
        info.add("Isha");
        info.add("Iscon");
        info.add("Iyyapan Temple");


        //simple_list_item_1 is defined in android framework which contains single TextView which the
        // adapter is set to display a word
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,info);

        //Find the oblect ListView in the view hierarchy of Activity
        //There should be a ListView with a view id list in the activity_temple.xml
        ListView listView = (ListView) findViewById(R.id.list);

        //Call setAdapter on ListView object and pass an argument which is arrayAdapter
        listView.setAdapter(arrayAdapter);
    }
}
