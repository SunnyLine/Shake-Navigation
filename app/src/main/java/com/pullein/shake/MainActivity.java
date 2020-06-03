package com.pullein.shake;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    SensorHelper sensorHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sensorHelper = new SensorHelper(this);
        sensorHelper.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (sensorHelper != null) {
            sensorHelper.stop();
        }
    }
}
