

package com.example.android.tourguideapp.fragment;


import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.tourguideapp.DetailActivity;
import com.example.android.tourguideapp.R;
import com.example.android.tourguideapp.adapter.ListAdapter;
import com.example.android.tourguideapp.model.Config;
import com.example.android.tourguideapp.model.Helper;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {

    public FoodFragment() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_pager, container, false);


        ListAdapter listAdapter = new ListAdapter(getActivity(), Helper.getFood(getContext()));


        ListView listView = rootView.findViewById(R.id.view_pager_activity);

        listView.setAdapter(listAdapter);

        // Set an listener on each item in the list view
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra(Config.CATEGORY_ID, Helper.getFood(getContext()).get(position));
                startActivity(i);
            }
        });

        return rootView;
    }

}