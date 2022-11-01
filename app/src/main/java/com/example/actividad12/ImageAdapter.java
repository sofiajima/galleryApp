package com.example.actividad12;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context myContext;
    public Bitmap[] imageArray = new Bitmap[3];

    public Bitmap[] getImageArray() {
        return imageArray;
    }

    public void setImageArray(Bitmap[] imageArray) {
        this.imageArray = imageArray;
    }

    public void add(Bitmap imageBitmap) {
        int i = 0;

        // add the imageBitmap to the first empty position in the array
        while (i < imageArray.length && imageArray[i] != null) {
            i++;
        }

        if (i < imageArray.length) {
            imageArray[i] = imageBitmap;
        }
    }

    public ImageAdapter(Context myContext) {
        this.myContext = myContext;
    }

    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int i) {
        return imageArray[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ImageView imageView = new ImageView(myContext);
        imageView.setImageBitmap(imageArray[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(340, 350));

        return imageView;
    }
}
