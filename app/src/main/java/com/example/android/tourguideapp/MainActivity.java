

package com.example.android.tourguideapp;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.android.tourguideapp.adapter.GridAdapter;
import com.example.android.tourguideapp.model.Helper;

import java.util.Locale;

import static com.example.android.tourguideapp.model.Config.TAB_SELECT;

public class MainActivity extends AppCompatActivity {


    GridView gridView;
    private Session session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        session = new Session(this);
        Locale myLocale = new Locale(session.GetLang());
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
        setContentView(R.layout.activity_main);

        GridAdapter adapter = new GridAdapter(this, Helper.getCategory(getApplicationContext()));
        gridView = findViewById(R.id.grid_container);
        gridView.setAdapter(adapter);


        final Intent intent = new Intent(MainActivity.this, PagerActivity.class);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        intent.putExtra(TAB_SELECT,0); // InfoFragment
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra(TAB_SELECT,1); // HotelFragment
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra(TAB_SELECT, 2); // FoodFragment
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra(TAB_SELECT, 3); // PlacesFragment
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra(TAB_SELECT, 4); // HistoryFragment
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra(TAB_SELECT, 5); // AdviseFragment
                        startActivity(intent);
                        break;
                        default:
                            intent.putExtra(TAB_SELECT, 0); // InfoFragment
                            startActivity(intent);
                            break;
                }
            }
        });

    }

    public void Eng(View view) {

        session.SetLang("en");
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }

    public void Kur(View view) {
        session.SetLang("ku");
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }

}
