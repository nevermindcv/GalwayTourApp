package com.example.chris.galwaytour2;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class RestoActivity2 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Button satellitebutton, hybredbutton, normalbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resto2);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        satellitebutton = (Button) findViewById(R.id.restosatellitebtn);
        hybredbutton = (Button) findViewById(R.id.restohybredbtn);
        normalbutton = (Button)findViewById(R.id.restonormalbtn);

        satellitebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
            }
        });

        hybredbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
            }
        });

        normalbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
            }
        });

    }


    @Override
        public void onMapReady(GoogleMap googleMap) {
            mMap = googleMap;

        GalwayResto(googleMap);

            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                    && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

                return;
            }
            mMap.setMyLocationEnabled(true);
            mMap.getUiSettings().setMyLocationButtonEnabled(true);
            mMap.getUiSettings().setZoomControlsEnabled(true);

        }

        public void GalwayResto (GoogleMap googleMap){
            mMap = googleMap;

            LatLng cava = new LatLng(53.271554, -9.053287);
            mMap.addMarker(new MarkerOptions().position(cava).title("Cava Bodega").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));

            final LatLng kirwan = new LatLng(53.271124, -9.054767);
            mMap.addMarker(new MarkerOptions().position(kirwan).title("The Seafood Bar at Kirwan's").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(kirwan,14),5000,null);

            LatLng vicolo = new LatLng(53.271588,-9.056477);
            mMap.addMarker(new MarkerOptions().position(vicolo).title("Il Vicolo").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

            LatLng oscar = new LatLng(53.270114,-9.058588);
            mMap.addMarker(new MarkerOptions().position(oscar).title("Oscar Bistro").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));



        }
}
