package com.example.android.visitcbe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by LENOVO on 21-06-2017.
 */

public class FoodActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);

        ArrayList<Info> info = new ArrayList<Info>();
        info.add(new Info("That's Y Food","Everyday Indian plates, clever beverages and desserts presented in a cheerful, contemporary setting."));
        info.add(new Info("On The Go","Stylish and informal restaurant with an urban chic style and a menu ranging multiple cuisines."));
        info.add(new Info("Afghan Hill","Hotel restaurant serving Afghan grilled specialties with al fresco seating."));
        info.add(new Info("Haribhavanam","Homely branch of a standard north and south Indian venue also serving Chinese cuisine."));
        info.add(new Info("Bird on Tree","Homely restaurant with a first floor terrace offering Indian, Continental and Asian dishes."));
        info.add(new Info("The Cascade","Enduring chain link for a menu of Chinese cuisine served in a simple, clean-lined dining room."));
        info.add(new Info("Shanthi Social Services Canteen","Healthy self-service canteen with an ice cream parlour owned by a medical and education charity."));
        info.add(new Info("Kowloon Chinese Restaurant","Simple Chinese restaurant with Asian wall art and balcony seating."));
        info.add(new Info("Peking Restaurant","Basic Chinese restaurant hung with red paper lanterns offering a standard Asian menu."));
        info.add(new Info("SMS Hotels","A traditional Indian and international restaurant at an intimate boutique hotel."));


        //simple_list_item_1 is defined in android framework which contains single TextView which the
        // adapter is set to display a word
        InfoAdapter arrayAdapter = new InfoAdapter(this,info);

        //Find the oblect ListView in the view hierarchy of Activity
        //There should be a ListView with a view id list in the info_list.xml
          ListView listView = (ListView) findViewById(R.id.list);

        //Call setAdapter on ListView object and pass an argument which is arrayAdapter
        listView.setAdapter(arrayAdapter);
    }
}
