package com.example.chris.galwaytour2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button allmapsbtn;

    private ImageView hotelsImage, placesImage, restoImage, musicImage, mapImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        placesImage = (ImageView)findViewById(R.id.placesIV);
        hotelsImage = (ImageView)findViewById(R.id.hotelIV);
        restoImage = (ImageView)findViewById(R.id.restoIV);
        musicImage = (ImageView)findViewById(R.id.musicIV);
        mapImage = (ImageView)findViewById(R.id.MmapIV);

        allmapsbtn = (Button)findViewById(R.id.mapmainbtn);

        hotelsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(MainActivity.this, HotelsActivity.class);
                startActivity(int1);
            }
        });


        placesImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1 = new Intent(MainActivity.this, PlacesActivity.class);
                startActivity(int1);
            }
        });

        restoImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1 = new Intent(MainActivity.this, RestaurantActivity.class);
                startActivity(int1);
            }
        });

        musicImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1 = new Intent(MainActivity.this, MusicActivity.class);
                startActivity(int1);
            }
        });

        allmapsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1 = new Intent(MainActivity.this, allMaps.class);
                startActivity(int1);

            }
        });

        mapImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1 = new Intent(MainActivity.this, allMaps.class);
                startActivity(int1);

            }
        });



    }
}
