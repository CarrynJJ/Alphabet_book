package com.example.carrynjayne.alphabet_book;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Carryn Jayne on 2017-10-04.
 */

public class ImageAdapter extends BaseAdapter{
    private Context letter;
    public static int RESULT_IMAGE = 1;

    public Integer [] images = {R.drawable.slide01, R.drawable.slide02,
            R.drawable.slide03, R.drawable.slide04,
            R.drawable.slide05, R.drawable.slide06,
            R.drawable.slide07, R.drawable.slide08,
            R.drawable.slide09, R.drawable.slide10,
            R.drawable.slide11, R.drawable.slide12,
            R.drawable.slide13, R.drawable.slide14,
            R.drawable.slide15, R.drawable.slide16,
            R.drawable.slide17, R.drawable.slide18,
            R.drawable.slide19, R.drawable.slide20,
            R.drawable.slide21, R.drawable.slide22,
            R.drawable.slide23, R.drawable.slide24,
            R.drawable.slide25, R.drawable.slide26};

    public ImageAdapter(Context context)
    {
        letter = context;
    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return images[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(letter);
        imageView.setImageResource(images[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setLayoutParams(new GridView.LayoutParams(240,240));
        return imageView;

    }



}
