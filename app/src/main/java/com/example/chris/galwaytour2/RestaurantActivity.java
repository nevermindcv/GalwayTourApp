package com.example.chris.galwaytour2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class RestaurantActivity extends AppCompatActivity {

    private Button MapsRestobutton;
    private ImageView placemapsimages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);


        MapsRestobutton = (Button)  findViewById(R.id.btnMapResto);
        placemapsimages = (ImageView) findViewById(R.id.restomapsIV);

        MapsRestobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent int1 = new Intent(RestaurantActivity.this, RestoActivity2.class);
                startActivity(int1);
            }

        });

        placemapsimages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent int1 = new Intent(RestaurantActivity.this, RestoActivity2.class);
                startActivity(int1);
            }

        });
    }
}
