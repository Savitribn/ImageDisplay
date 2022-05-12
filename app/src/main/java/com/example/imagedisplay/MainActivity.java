package com.example.imagedisplay;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements
        AdapterView.OnItemClickListener {


    public static final Integer[] images = { R.drawable.image1, R.drawable.image2,
            R.drawable.image3, R.drawable.image4, R.drawable.image5, R.drawable.image6, R.drawable.image7,R.drawable.image8,R.drawable.image9,R.drawable.image10 };

    ListView listView;
    List<RowItem> rowItems;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rowItems = new ArrayList<RowItem>();
        for (int i = 0; i < images.length; i++) {
            RowItem item = new RowItem(images[i]);
            rowItems.add(item);
        }

        listView = (ListView) findViewById(R.id.list);
        ImageAdapter adapter = new ImageAdapter(this,
                R.layout.image_loder, rowItems);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {

    }
}