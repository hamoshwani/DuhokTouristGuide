
package com.example.android.tourguideapp.fragment;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.tourguideapp.R;
import com.example.android.tourguideapp.adapter.InfoAdapter;
import com.example.android.tourguideapp.model.Helper;


public class InfoFragment extends Fragment {

    public InfoFragment() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    // this method send the url from an onclick position
    public void openWebPage(String webUrl) {
        Uri webPage = Uri.parse(webUrl);
        Intent intent = new Intent(Intent.ACTION_VIEW, webPage);
        if (intent.resolveActivity(getActivity().getPackageManager()) != null){
            startActivity(intent);
        }
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_pager, container, false);


        final String [] webUrl = getResources().getStringArray(R.array.info_web_1);

        InfoAdapter infoAdapter = new InfoAdapter(getActivity(), Helper.getInfo(getContext()));


        ListView listView = rootView.findViewById(R.id.view_pager_activity);


        listView.setAdapter(infoAdapter);

        // Set an listener on each item in the list view
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                openWebPage(webUrl[(position)]);
            }
        });

        return rootView;
    }

}
