package com.sinothk.map.amap.location.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sinothk.map.amap.location.AMapLocation;

public class LocationDemoMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_demo_main);

        AMapLocation.location(this);
    }
}