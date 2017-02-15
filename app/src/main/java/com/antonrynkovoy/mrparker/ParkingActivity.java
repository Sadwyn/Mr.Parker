package com.antonrynkovoy.mrparker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ParkingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.parking_layout);
        String str = intent.getStringExtra("name");
        TextView view = (TextView)findViewById(R.id.textView3);
        view.setText(str);

    }
}
