package com.example.carrynjayne.alphabet_book;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    private final static int READ_EXTERNAL_STORAGE_PERMISSION_RESULT = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView) findViewById(R.id.gridView);

        gridView.setAdapter(new ImageAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int letter, long id) {
                Intent i = new Intent(getApplicationContext(), FullImageDisplay.class);
                i.putExtra("id", letter);
                startActivity(i);
            }
        });

        checkReadExternalPermission();
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

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,@NonNull int[] grantResults) {
        switch (requestCode)
        {
            case READ_EXTERNAL_STORAGE_PERMISSION_RESULT:
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED)
                {

                }
                break;
            default:
                super.onRequestPermissionsResult(requestCode, permissions, grantResults);
                break;
        }

    }

    private void checkReadExternalPermission()
    {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
        {
            if(ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) ==
                    PackageManager.PERMISSION_GRANTED)
            {

            } else
            {
                requestPermissions(new String[] {Manifest.permission.READ_EXTERNAL_STORAGE}, READ_EXTERNAL_STORAGE_PERMISSION_RESULT);
            }
        }
        else
        {

        }
    }

}
