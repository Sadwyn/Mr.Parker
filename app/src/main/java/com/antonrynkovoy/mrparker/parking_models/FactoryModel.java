package com.antonrynkovoy.mrparker.parking_models;

import android.content.Context;

import com.antonrynkovoy.mrparker.markers.ParkingNames;


final public class FactoryModel {


    private static FactoryModel factory;

    private FactoryModel(){}

    public static synchronized FactoryModel getInstance(){

        if(factory==null){
            factory = new FactoryModel();
        }
        return factory;
    }

    public synchronized Parking getParking(String parkingName, Context context ){


        if (parkingName.equals(ParkingNames.Luxoft.name())) {
            return new Luxoft(context);
        } else if (parkingName.equals(ParkingNames.Riviera.name())) {
            return new Riviera(context);
        }
        return null;
    }
}
