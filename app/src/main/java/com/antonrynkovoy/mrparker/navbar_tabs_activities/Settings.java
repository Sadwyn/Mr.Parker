package com.antonrynkovoy.mrparker.navbar_tabs_activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.antonrynkovoy.mrparker.MainActivity;
import com.antonrynkovoy.mrparker.R;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void changeCity(View view) {
        SharedPreferences sPref = getSharedPreferences("MainActivity",MODE_PRIVATE);
        SharedPreferences.Editor editor = sPref.edit();
        editor.clear();
        editor.apply();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);


    }
}
