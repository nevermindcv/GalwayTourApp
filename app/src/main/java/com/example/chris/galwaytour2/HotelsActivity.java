package com.example.chris.galwaytour2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HotelsActivity extends AppCompatActivity {

    private Button MapsHotelsbutton;
    private ImageView maphotelImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);


        MapsHotelsbutton = (Button)  findViewById(R.id.BtnMapsHotels);
        maphotelImagen = (ImageView) findViewById(R.id.HMapsIV);

                MapsHotelsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent int1 = new Intent(HotelsActivity.this, MapsHotels.class);
                startActivity(int1);
            }

        });

        maphotelImagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent int1 = new Intent(HotelsActivity.this, MapsHotels.class);
                startActivity(int1);
            }

        });
    }
}
