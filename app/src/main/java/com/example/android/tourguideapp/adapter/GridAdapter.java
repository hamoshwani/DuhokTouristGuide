

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


public class GridAdapter extends ArrayAdapter<Places> {


    public GridAdapter(Activity context, ArrayList<Places> itemList) {
        super(context, 0, itemList);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, @Nullable ViewGroup parent) {
        /* Check if the existing view is being reused, otherwise inflate the view */
        View gridView = convertView;
        if(gridView == null) {
            gridView = LayoutInflater.from(getContext()).inflate(
                    R.layout.grid_item, parent, false);
        }


        Places currentList = getItem(position);


        TextView titleName = gridView.findViewById(R.id.title);
        if (currentList != null) {
            titleName.setText(currentList.getTitleName());
        }


        ImageView drawablePicId = gridView.findViewById(R.id.image);
        if (currentList != null) {
            drawablePicId.setImageResource(currentList.getPhotoId());
        }


        ImageView drawableIconId = gridView.findViewById(R.id.icon);
        if (currentList != null) {
            drawableIconId.setImageResource(currentList.getIconId());
        }

        /* Return the whole list item layout */
        return gridView;
    }

}
