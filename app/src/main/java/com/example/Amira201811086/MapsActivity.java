/*
https://developers.google.com/maps/documentation/android-sdk/configure-map#initial-settings
https://developers.google.com/maps/documentation/android-sdk/start
 */


package com.example.Amira201811086;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.example.Amira201811086.databinding.ActivityMapsBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    private GoogleMap googleMap;
    int position;
    String alllatitude,alllongitude,alldirname;

//    GoogleMapOptions options = new GoogleMapOptions();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Get a handle to the fragment and register the callback.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        // Set the layout file as the content view.
        setContentView(R.layout.activity_main);


//        Intent i=getIntent();
//
//        position=i.getIntExtra("POSITION", 0);
//
//        alllatitude=i.getStringExtra("LATITUDE");
//        alllongitude=i.getStringExtra("LONGITUDE");
//        alldirname=i.getStringExtra("DIRNAME");
//        LatLng TutorialsPoint = new LatLng(Double.parseDouble(alllatitude), Double.parseDouble(alllongitude));
//        try {
//            if (googleMap == null) {
//                googleMap = ((MapFragment) getFragmentManager()
//                        .findFragmentById(R.id.map).getMap(true));
//            }
//
//           // mMap.setMyLocationEnabled(true);
//
//            googleMap.getUiSettings().setMyLocationButtonEnabled(true);
//
//            googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
//            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(TutorialsPoint, 15.0f));
//            googleMap.addMarker(new MarkerOptions().position(TutorialsPoint)
//                    .title(alldirname));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * i just add a marker near Muscat, Oman.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {

//        googleMap.addMarker(new MarkerOptions()
//                .position(new LatLng(0, 0))
//                .title("Marker"));

        mMap = googleMap;

        // Add a marker in Muscat and move the camera
        LatLng Muscat = new LatLng(23, 58);
        mMap.addMarker(new MarkerOptions().position(Muscat).title("Marker in Muscat"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Muscat));


//       options.mapType(GoogleMap.MAP_TYPE_SATELLITE)
//                .compassEnabled(false)
//                .rotateGesturesEnabled(false)
//                .tiltGesturesEnabled(false);
//
//        // Sets the map type to be "hybrid"
//        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);


    }
}