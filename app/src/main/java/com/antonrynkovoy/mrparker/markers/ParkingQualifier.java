package com.antonrynkovoy.mrparker.markers;


public class ParkingQualifier {
   private MarkersList markers = new MarkersList();

    public MarkersList getMarkers() {
        return markers;
    }

    public String defineRightParking(String title){
        if(ParkingNames.Luxoft.name().equals(title)) return "parking_layout";
        else if(ParkingNames.Riviera.name().equals(title)) return "riviera_parking";
        else return "";
    }
}
