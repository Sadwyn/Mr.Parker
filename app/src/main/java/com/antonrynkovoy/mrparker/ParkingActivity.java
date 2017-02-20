package com.antonrynkovoy.mrparker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.antonrynkovoy.mrparker.parking_models.FactoryModel;
import com.antonrynkovoy.mrparker.parking_models.Luxoft;
import com.antonrynkovoy.mrparker.parking_models.Parking;

public class ParkingActivity extends AppCompatActivity {

    FactoryModel factoryModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String parkingName = intent.getStringExtra("name");
        factoryModel = FactoryModel.getInstance();
        Parking parking = factoryModel.getParking(parkingName, this);
        setContentView(parking);

    }
}
