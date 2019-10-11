package com.example.carrynjayne.alphabet_book;

import android.content.Intent;
import android.os.Environment;
import android.support.constraint.solver.ArrayLinkedVariables;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;


public class FullImageDisplay extends AppCompatActivity {

    private ImageView imageView;
    private ImageAdapter adapter;
    private int letterIndex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image_display);


        Intent clicked = getIntent();

        int letter = clicked.getExtras().getInt("id");
        adapter = new ImageAdapter(this);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(adapter.images[letter]);
        letterIndex = letter;

    }

    @Override
    protected void onStart()
    {
        super.onStart();
    }

    @Override
    protected void onStop()
    {
        super.onStop();
    }
    @Override
    protected void onPause()
    {
        super.onPause();
    }
    @Override
    protected void onRestart()
    {
        super.onRestart();
    }

    public void firstButtonClicked(View view) {
        imageView.setImageResource(adapter.images[0]);
        letterIndex = 0;
    }

    public void lastButtonClicked(View view) {
        imageView.setImageResource(adapter.images[25]);
        letterIndex = 25;

    }

    public void prevButtonClicked(View view) {
        if (letterIndex == 0)
        {
            Toast.makeText(this, "This is the first image.",Toast.LENGTH_SHORT).show();
        }
        else
        {

            letterIndex --;
            imageView.setImageResource(adapter.images[letterIndex]);
        }
    }

    public void nextButtonClicked(View view) {
        if (letterIndex == 25)
        {
            Toast.makeText(this, "This is the last image.",Toast.LENGTH_SHORT).show();
        }
        else
        {

            letterIndex ++;
            imageView.setImageResource(adapter.images[letterIndex]);
        }
    }

    public void overviewClicked(View view)
    {
        //Intent backButton = new Intent(this, MainActivity.class);
        //startActivity(backButton);
        finish();
    }

}
