package com.example.chris.galwaytour2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PlacesActivity extends AppCompatActivity {

    private Button MapsPlacessbutton;
    private ImageView placeMapsImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);


        MapsPlacessbutton = (Button)  findViewById(R.id.BtnMapsPlaces);
        placeMapsImage = (ImageView) findViewById(R.id.placemapsIV);

        MapsPlacessbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent int1 = new Intent(PlacesActivity.this, MapsActivity.class);
                startActivity(int1);
            }

        });

        placeMapsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent int1 = new Intent(PlacesActivity.this, MapsActivity.class);
                startActivity(int1);
            }

        });
    }
}
