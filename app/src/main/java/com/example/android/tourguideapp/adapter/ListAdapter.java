

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



public class ListAdapter extends ArrayAdapter<Places>{



    public ListAdapter(Activity context, ArrayList<Places> listPager) {
        super(context, 0, listPager);
    }



    @NonNull
    @Override
    public View getView(int position, View convertView, @Nullable ViewGroup parent) {

        View listViewPager = convertView;
        if(listViewPager == null) {
            listViewPager = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Places currentList = getItem(position);


        TextView titleName = listViewPager.findViewById(R.id.list_title_name);
        if (currentList != null) {
            titleName.setText(currentList.getTitleName());
        }


        TextView itemName = listViewPager.findViewById(R.id.list_item_name);
        if (currentList != null) {
            itemName.setText(currentList.getItemName());
        }


        ImageView drawablePicId = listViewPager.findViewById(R.id.list_image_view);
        if (currentList != null) {
            drawablePicId.setImageResource(currentList.getPhotoId());
        }




        /* Return the whole list item layout */
        return listViewPager;
    }
}
