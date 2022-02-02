package com.example.android.tourguideapp.adapter;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguideapp.R;
import com.example.android.tourguideapp.model.Places;

import java.util.ArrayList;


public class InfoAdapter extends ArrayAdapter<Places>{

    /**
     * This is a custom constructor.
     * The context is used to inflate the layout file.
     * The list is the data we want to populate into the list
     * @param context The current context. Used to inflate the layout.
     * @param listPager A list of Places object to display in a list
     */

    public InfoAdapter(Activity context, ArrayList<Places> listPager) {
        super(context, 0, listPager);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, @Nullable ViewGroup parent) {
        /* Check if the existing view is being reused, otherwise inflate the view */
        View listViewPager = convertView;
        if(listViewPager == null) {
            listViewPager = LayoutInflater.from(getContext()).inflate(
                    R.layout.info_item, parent, false);
        }


        Places currentList = getItem(position);


        TextView infoText = listViewPager.findViewById(R.id.info_text);
        if (currentList != null) {
            infoText.setText(currentList.getTitleName());
        }


        TextView infoText2 = listViewPager.findViewById(R.id.info_text_2);
        if (currentList != null) {
            infoText2.setText(currentList.getItemName());
        }


        ImageView drawablePicId = listViewPager.findViewById(R.id.info_image);
        if (currentList != null) {
            drawablePicId.setImageResource(currentList.getPhotoId());
        }


        /* Return the whole list item layout */
        return listViewPager;
    }

}