package com.epainassist.elvpa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    String[] painCategories = new String[] {
            "Abdominal Pain",
            "Back Pain",
            "Ankle Pain",
            "Personal Injury",
            "Alternative Therapy",
            "Yoga",
            "Chakra",
            "Knee Pain",
            "Low Back Pain",
            "Wrist Pain",
            "Chest Pain",
            "Headache",
            "Shoulder pain",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //list view  loading Here --> This is a basic List view

        ListView elvpa = (ListView)findViewById(R.id.elvpa);
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,painCategories
        );
        elvpa.setAdapter(adapter);

    }

  }
