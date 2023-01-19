package com.example.mychildlearningapplication;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FruitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

        String name = getIntent().getStringExtra("name".toLowerCase());
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();

        ImageView iv = findViewById(R.id.imageView2);


        int iid = getResources().getIdentifier(name.toLowerCase(), "drawable", getPackageName());
        iv.setImageResource(iid);

      /*  int mid;
        mid = getResources().getIdentifier(name, "raw", getPackageName());
        if (mid == -1) {
            Log.e("MediaPlayer", "Resource not found: " + name);
            return; // or show an error message to the user
        }
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), mid2);
        mp.start();*/

    }
}