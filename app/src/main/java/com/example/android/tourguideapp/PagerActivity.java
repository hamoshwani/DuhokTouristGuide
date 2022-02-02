
package com.example.android.tourguideapp;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.material.tabs.TabLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import com.example.android.tourguideapp.adapter.PagerAdapter;
import com.example.android.tourguideapp.fragment.TabFragment;

import static com.example.android.tourguideapp.model.Config.TAB_SELECT;

public class PagerActivity extends AppCompatActivity {

    private static int tabSelect = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.category_main);


        if (getIntent().getExtras() != null) {
            Bundle bundle = getIntent().getExtras();
            tabSelect = bundle.getInt(TAB_SELECT);
        }


        ViewPager vp = findViewById(R.id.viewpager);

        PagerAdapter adapter = new PagerAdapter(this, getSupportFragmentManager());


        vp.setAdapter(adapter);
        vp.setCurrentItem(tabSelect);


        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(vp);
    }
}
