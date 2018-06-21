package com.example.chris.galwaytour2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MusicActivity extends AppCompatActivity {


    private Button buttonMapMusic;
    private ImageView musicMapImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        buttonMapMusic = (Button)  findViewById(R.id.btnMapMusic);
        musicMapImage = (ImageView) findViewById(R.id.musicMapIV);


        buttonMapMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent int1 = new Intent(MusicActivity.this, MapsMusic.class);
                startActivity(int1);
            }

        });

        musicMapImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent int1 = new Intent(MusicActivity.this, MapsMusic.class);
                startActivity(int1);
            }

        });
    }
}
