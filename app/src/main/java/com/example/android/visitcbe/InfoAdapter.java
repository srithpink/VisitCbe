package com.example.android.visitcbe;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by LENOVO on 22-06-2017.
 */

public class InfoAdapter extends ArrayAdapter<Info> {

    public static final String LOG_TAG = InfoAdapter.class.getSimpleName();


    public InfoAdapter(Activity context, ArrayList<Info> infos) {

        super(context, 0, infos);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Info currentInfo = getItem(position);

        TextView nameText = (TextView) listItemView.findViewById(R.id.list_name);

        nameText.setText(currentInfo.getNameId());


        TextView infoText = (TextView) listItemView.findViewById(R.id.list_description);

        infoText.setText(currentInfo.getmDescriptionId());


        //ImageView imageImage = (ImageView) listItemView.findViewById(R.id.list_image);

        // imageImage.setImageResource(currentInfo.getImageId());

          return listItemView;


    }
}

