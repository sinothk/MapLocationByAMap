package com.sinothk.map.amap.location.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sinothk.map.amap.location.AMapLocation;
import com.sinothk.map.amap.location.AMapLocationCallback;
import com.sinothk.map.amap.location.AMapLocationEntity;

public class LocationDemoMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_demo_main);

//        AMapLocation.with(this).location(this, new AMapLocationCallback() {
//
//            @Override
//            public void complete(AMapLocationEntity locEntity) {
//                if (locEntity.getCode() == 0) {
//
//                } else {
//
//                }
//            }
//        });

        AMapLocation.with(this).locateContinue(this, 3, new AMapLocationCallback() {
            @Override
            public void complete(AMapLocationEntity locEntity) {
                if (locEntity.getCode() == 0) {

                } else {

                }
            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(12 * 1000);

                    AMapLocation.with(LocationDemoMainActivity.this).locateStop();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
