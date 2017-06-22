package com.example.android.visitcbe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by LENOVO on 21-06-2017.
 */

public class TouristsplacesActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstancestate){
        super.onCreate(savedInstancestate);
        setContentView(R.layout.info_list);
        ArrayList<Info> info = new ArrayList<Info>();
        info.add(new Info("VOC Park and Zoo","V O Chidambaranar park and zoo is a zoological garden and amusement park located in Coimbatore, Tamil Nadu, India. As of 2013, the park houses around 890 animals including 335 birds, 106 mammals and 54 reptiles."));
        info.add(new Info("Monkey Falls","Monkey Falls are natural waterfalls located near the uphill ghat road Valparai on the Pollachi-Valparai road in the Anaimalai Hills range, in Coimbatore district. Monkey Falls is about 30 km from Pollachi."));
        info.add(new Info("Gedee Car Museum","Museum featuring an eclectic range of automobiles, with an emphasis on design & innovation."));
        info.add(new Info("Siruvani Waterfalls","Siruvani Waterfalls and the dam named after them are located 35 km west of Coimbatore in the Western Ghats."));
        info.add(new Info("Aliyar Dam Park","Large park offering gardens, playgrounds & picnic areas beside a dam with water & mountain views."));
        info.add(new Info("Velliangiri Mountains","The Velliangiri Mountains, (Tamil: வெள்ளியங்கிரி மலை) a part of the Nilgiri Biosphere Reserve, are situated at the Western Ghats border of Coimbatore district, Tamil Nadu."));
        info.add(new Info("Ooty","At a distance of 89 km from Coimbatore, 128 km from Mysore, 265 km from Bangalore,158 km from Kozhikode, 244 km from Munnar, 254 km from Kodaikanal, 18 km from Coonoor & 556 km from Chennai, Ooty is one of the best hill stations in India and also one of the top places to experince Tamilnadu Tourism."));
        info.add(new Info("Palakkad","At a distance of 52 km from Coimbatore, 140 km from Kochi, 65 km from Thrissur and 336 km from Trivandrum, Palakkad, also known as Palghat, is a town and headquarters of Palakkad district in the state of Kerala. Palakkad, the Granary of Kerala, is situated at the foot of the Gigantic Western Ghats on the border of Kerala and Tamilnadu. "));
        info.add(new Info("Mazhampuzha Dam & Gardens","At a distance of 9 Kms from Palakkad Railway Station, Malampuzha Dam is a large irrigation dam built on Malampuzha River, a tributary of Bharathapuzha River at the base of the hills of the Western Ghats. The reservoir provides drinking water to Palakkad town."));
        info.add(new Info("Topslip","Topslip is the Tiger Reserve Forest in small part of Annamalai Tiger Reserve, which is separated from the Nilgiri Hills by Palghat Gap in north. It got its name during British era, as lots of its timber sliped down to the plains below. Being a medical plant conservation area, it is famous for the elephant camp, wildlife safaris, pleasant weather and beautiful views of Annamalai Hills. "));


        //simple_list_item_1 is defined in android framework which contains single TextView which the
        // adapter is set to display a word
        InfoAdapter arrayAdapter = new InfoAdapter(this,info);

        //Find the oblect ListView in the view hierarchy of Activity
        //There should be a ListView with a view id list in the info_list
         ListView listView = (ListView) findViewById(R.id.list);

        //Call setAdapter on ListView object and pass an argument which is arrayAdapter
        listView.setAdapter(arrayAdapter);
    }
}
