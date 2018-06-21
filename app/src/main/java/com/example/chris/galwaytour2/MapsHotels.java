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

public class MapsHotels extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Button satellitebutton, hybredbutton, normalbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_hotels);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        satellitebutton = (Button) findViewById(R.id.hotelsatellitebtn);
        hybredbutton = (Button) findViewById(R.id.hotelhybredbtn);
        normalbutton = (Button)findViewById(R.id.hotelnormalbtn);

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

        GalwayHotels(googleMap);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        mMap.setMyLocationEnabled(true);
        mMap.getUiSettings().setMyLocationButtonEnabled(true);
        mMap.getUiSettings().setZoomControlsEnabled(true);

    }

    public void GalwayHotels (GoogleMap googleMap){
        mMap = googleMap;

        final LatLng HouseHotel = new LatLng(53.270513, -9.053495);
        mMap.addMarker(new MarkerOptions().position(HouseHotel).title("The House Hotel").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(HouseHotel,14),5000,null);

        LatLng JurysInn = new LatLng(53.270815,-9.054894);
        mMap.addMarker(new MarkerOptions().position(JurysInn).title("Jury's Inn Hotel").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        LatLng ClaytonHotel = new LatLng(53.291480,-8.989249);
        mMap.addMarker(new MarkerOptions().position(ClaytonHotel).title("Clayton Hotel").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));


        LatLng NoxHotel = new LatLng(53.286365,-9.042070);
        mMap.addMarker(new MarkerOptions().position(NoxHotel).title("Nox Hotel").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));



    }
}
