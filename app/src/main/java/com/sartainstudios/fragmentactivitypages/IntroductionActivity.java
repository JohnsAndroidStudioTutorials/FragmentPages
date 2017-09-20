package com.sartainstudios.fragmentactivitypages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class IntroductionActivity extends AppCompatActivity {

    private static final String TAG = "IntroductionActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
        Log.d(TAG, "IntroductionActivity: Started");
    }
}
