package com.antonrynkovoy.mrparker.markers;


import android.content.Intent;

import com.antonrynkovoy.mrparker.GoogleMapActivity;
import com.antonrynkovoy.mrparker.ParkingActivity;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MarkersList extends ArrayList<MarkerOptions>{
    public MarkersList() {
       this.add(new MarkerOptions().position(new LatLng(46.468736, 30.712678)).title(ParkingNames.Luxoft.name()));
       this.add(new MarkerOptions().position(new LatLng(46.562465, 30.834758)).title(ParkingNames.Riviera.name()));
    }

}
