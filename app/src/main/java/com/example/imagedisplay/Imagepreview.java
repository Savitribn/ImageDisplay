package com.example.imagedisplay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Imagepreview extends Activity {
    ImageView imgPrev;
    int pos;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.image_preview);
            imgPrev = (ImageView) findViewById(R.id.imagePrev);
            Bundle extras = getIntent().getExtras();
            if(extras!=null){
                pos=extras.getInt("pos");

            }
            imgPrev.setImageResource(pos);

        }
    }
