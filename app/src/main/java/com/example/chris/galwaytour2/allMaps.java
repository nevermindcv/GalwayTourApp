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
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class allMaps extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    private Button satellitebutton, hybredbutton, normalbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        satellitebutton = (Button) findViewById(R.id.allmapsatellitebtn);
        hybredbutton = (Button) findViewById(R.id.allmaphybredbtn);
        normalbutton = (Button)findViewById(R.id.allmapnormalbtn);

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

        mainsmaps(googleMap);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        mMap.setMyLocationEnabled(true);
        mMap.getUiSettings().setMyLocationButtonEnabled(true);
        mMap.getUiSettings().setZoomControlsEnabled(true);

    }

    public void mainsmaps (GoogleMap googleMap){
        mMap = googleMap;

        LatLng Kylemore = new LatLng(53.561750, -9.889325);
        mMap.addMarker(new MarkerOptions().position(Kylemore).title("Kylemore").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));


        final LatLng StNicholasChurch = new LatLng(53.272743, -9.053802);
        mMap.addMarker(new MarkerOptions().position(StNicholasChurch).title("St. Nicholas' Church").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng blackrock = new LatLng(53.257267,-9.091475);
        mMap.addMarker(new MarkerOptions().position(blackrock).title("Black Rock").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        LatLng GalwayCathedral = new LatLng(53.275192,-9.057608);
        mMap.addMarker(new MarkerOptions().position(GalwayCathedral).title("Galway Cathedral").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));

        LatLng GalwayMuseum = new LatLng(53.269730,-9.053578);
        mMap.addMarker(new MarkerOptions().position(GalwayMuseum).title("Galway City Museum").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));

        final LatLng HouseHotel = new LatLng(53.270513, -9.053495);
        mMap.addMarker(new MarkerOptions().position(HouseHotel).title("The House Hotel").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng JurysInn = new LatLng(53.270815,-9.054894);
        mMap.addMarker(new MarkerOptions().position(JurysInn).title("Jury's Inn Hotel").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        LatLng ClaytonHotel = new LatLng(53.291480,-8.989249);
        mMap.addMarker(new MarkerOptions().position(ClaytonHotel).title("Clayton Hotel").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));

        LatLng NoxHotel = new LatLng(53.286365,-9.042070);
        mMap.addMarker(new MarkerOptions().position(NoxHotel).title("Nox Hotel").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));

        final LatLng quays = new LatLng(53.271156, -9.054044);
        mMap.addMarker(new MarkerOptions().position(quays).title("The Quays Bar").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng TigChoili = new LatLng(53.272299,-9.053551);
        mMap.addMarker(new MarkerOptions().position(TigChoili).title("Tig Choili").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        LatLng taaffes = new LatLng(53.272392,-9.053284);
        mMap.addMarker(new MarkerOptions().position(taaffes).title("Taaffes Bar").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(taaffes,14),5000,null);

        LatLng roisin = new LatLng(53.270138, -9.058159);
        mMap.addMarker(new MarkerOptions().position(roisin).title("Roisin Dubh").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));

        final LatLng kirwan = new LatLng(53.271124, -9.054767);
        mMap.addMarker(new MarkerOptions().position(kirwan).title("The Seafood Bar at Kirwan's").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng vicolo = new LatLng(53.271588,-9.056477);
        mMap.addMarker(new MarkerOptions().position(vicolo).title("Il Vicolo").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        LatLng oscar = new LatLng(53.270114,-9.058588);
        mMap.addMarker(new MarkerOptions().position(oscar).title("Oscar Bistro").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));

        LatLng cava = new LatLng(53.271554, -9.053287);
        mMap.addMarker(new MarkerOptions().position(cava).title("Cava Bodega").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));

    }
}
