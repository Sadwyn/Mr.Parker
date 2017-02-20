package com.antonrynkovoy.mrparker.markers;


import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

import static com.antonrynkovoy.mrparker.markers.ParkingNames.*;

public class MarkersList extends ArrayList<MarkerOptions>{
    public MarkersList() {
       this.add(new MarkerOptions().position(new LatLng(46.468736, 30.712678)).title(Luxoft.name()));
       this.add(new MarkerOptions().position(new LatLng(46.562465, 30.834758)).title(Riviera.name()));
    }
}
