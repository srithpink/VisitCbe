package com.example.android.visitcbe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * Created by LENOVO on 21-06-2017.
 */

public class TempleActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);

        ArrayList<Info> info = new ArrayList<Info>();
        info.add(new Info("Perur Pateeshwarar Temple","Perur Pateeswarar Temple is a Hindu temple dedicated to Shiva located at Perur, in western part of Coimbatore in state of Tamil Nadu in India. The temple was built by Karikala Chola."));
        info.add(new Info("Marudhamalai Murugan Temple","Subramaniyaswami Temple, Marudamalai is a popular 12th century hill temple dedicated to Hindu god Murugan, situated near Coimbatore, Tamil Nadu, India. It is considered as 7 House of Lord Murugan."));
        info.add(new Info("Koniamman Temple","Koniamman Temple is one of the most famous temples of Coimbatore. The Temple was built around 600 years ago by the leader of a small cult 'Irulas'."));
        info.add(new Info("Thandumaariyamman Temple","Thandu Mariamman Temple is a Hindu temple dedicated to Thandu Mariamman located in Uppilipalayam, Coimbatore, Tamil Nadu, India. According to mythology, the goddess is said to have cured the soldiers of the ruler of Kongu Nadu from chicken pox."));
        info.add(new Info("Eachanaari Vinayagar Temple","Eachanari Vinayagar Temple is a temple dedicated to Hindu god Vinayagar, situated near Coimbatore, Tamil Nadu, India. The temple is situated about 12 km from the city of Coimbatore on NH 209."));
        info.add(new Info("Saibaba Temple","Sri Naga Sai Mandir is a Hindu temple dedicated to the Indian Spiritual Master Shirdi Sai Baba in Coimbatore, Tamil Nadu, India. "));
        info.add(new Info("Sri Ashtaamsha varadha aanjaneyar Temple","The temple is located in Peelamedu.The main Gos is Hanuman."));
        info.add(new Info("Isha","The Dhyanalinga is a Yogic temple located 30 km from Coimbatore, Tamil Nadu. The temple was consecrated on June 24, 1999 by Sadhguru Jaggi Vasudev, a yogi and mystic. The temple is consecrated using prana prathista and is dedicated for meditation."));
        info.add(new Info("Iscon","Community services from Annadaan to cow protection and kids & youth services to festivals and fun! Experience the teachings of timeless Indian wisdom given in the Gita and bring the philosophy of life to practice to solve all material problems with unique spiritual solutions in Bhakti Yoga with experienced counsellors and mentors. "));
        info.add(new Info("Iyyapan Temple"," The temple of Lord Sri Ayyappa Swami is situated in the mid part of the city,.The devotees are much proud to honour the temple as the Second Sabari Mala. The Siddhapudur Ayyappa Swami Temple is a well known and a famous temple."));


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
