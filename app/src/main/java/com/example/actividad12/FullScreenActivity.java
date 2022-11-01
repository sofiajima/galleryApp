package com.example.actividad12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

public class FullScreenActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);

        imageView = (ImageView) findViewById(R.id.image_view);

        getSupportActionBar().setTitle("Full Screen Image");

        Intent i = getIntent();

        Object image = i.getExtras().get("image");


        ImageAdapter imageAdapter = new ImageAdapter(this);
        // turn object into bitmap
        imageView.setImageBitmap((Bitmap) image);


    }
}