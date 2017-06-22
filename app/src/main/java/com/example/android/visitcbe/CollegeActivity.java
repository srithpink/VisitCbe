package com.example.android.visitcbe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by LENOVO on 21-06-2017.
 */

public class CollegeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);
        ArrayList<Info> info = new ArrayList<Info>();
        info.add(new Info("PSG College of Technology","PSG College of Technology is an autonomous, government aided, private engineering college in Coimbatore, India. It is affiliated to Anna University."));
        info.add(new Info("Sri Ramakrishna Engineering College","Sri Ramakrishna Engineering College is an autonomous Engineering college in India founded by Sevaratna Dr.R.Venkatesalu. "));
        info.add(new Info("Coimbatore Institute of Technology","Coimbatore Institute of Technology is government-aided autonomous engineering college located in Coimbatore, Tamil Nadu, India. It was founded in 1956 by V. Rangaswamy Naidu Educational Trust."));
        info.add(new Info("Government College of Technology","Government College of Technology, Coimbatore is an autonomous state-funded engineering college located in Coimbatore, Tamil Nadu, India. It is affiliated to Anna University."));
        info.add(new Info("Eachanaari Vinayagar Temple","5kms from selvapuram"));
        info.add(new Info("Kumaraguru College of Technology","Kumaraguru College of Technology, Coimbatore is a private Engineering College started in 1984 under the auspices of Ramanandha Adigalar Foundation, a charitable educational trust of Sakthi Group."));
        info.add(new Info("Sri Krishna College of Engineering & Technology","Sri Krishna College of Engineering & Technology is an autonomous institution at Sugunapuram near Kuniamuthur, Coimbatore, India. The college was started in 1998 with 180 students and 18 staff and offered four courses in the Bachelor of Engineering. "));
        info.add(new Info("Government Arts College, Coimbatore","Government Arts College is an autonomous college located in Coimbatore, Tamil Nadu, India and affiliated to Bharathiar University. It is located in the Arts College road, opposite to Cheran towers."));
        info.add(new Info("Tamil Nadu College of Engineering","Tamil Nadu College of Engineering also known as TCE, is a private self-financing engineering college situated in Karumathampatti, Coimbatore, Tamil Nadu, India. The college was established in 1984. The college is affiliated to Anna University."));
        info.add(new Info("PSG College of Arts and Science","PSG College of Arts and Science is a College of Arts and Sciences in Coimbatore, Tamil Nadu, India. It was founded in 1947 by G. R. Govindarajulu and G. R. Damodaran."));


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
