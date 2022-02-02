
package com.example.android.tourguideapp.adapter;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.android.tourguideapp.PagerActivity;
import com.example.android.tourguideapp.R;
import com.example.android.tourguideapp.fragment.BarFragment;
import com.example.android.tourguideapp.fragment.EventsFragment;
import com.example.android.tourguideapp.fragment.FoodFragment;
import com.example.android.tourguideapp.fragment.HotelFragment;
import com.example.android.tourguideapp.fragment.InfoFragment;
import com.example.android.tourguideapp.fragment.PlacesFragment;
import com.example.android.tourguideapp.fragment.TabFragment;
import com.example.android.tourguideapp.model.Places;

import static com.example.android.tourguideapp.model.Config.PAGES_COUNT;



public class PagerAdapter extends FragmentPagerAdapter {


    private String [] tabTitles;


    public PagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        /* Initialize variable with the string resource */
        tabTitles = context.getResources().getStringArray(R.array.categories1);
    }

    @Override
    public int getCount() {
        return PAGES_COUNT;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new InfoFragment();
            case 1:
                return new HotelFragment();
            case 2:
                return new FoodFragment();
            case 3:
                return new BarFragment();
            case 4:
                return new EventsFragment();
            case 5:
                return new PlacesFragment();
            default:
                return new InfoFragment();
        }
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
