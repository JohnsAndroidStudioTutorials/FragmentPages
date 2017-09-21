package com.sartainstudios.fragmentactivitypages;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class IntroductionActivity extends AppCompatActivity {

    private static final String TAG = "IntroductionActivity";

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
        Log.d(TAG, "IntroductionActivity: Started");

        viewPager = (ViewPager) findViewById(R.id.fragmentContainerViewPager);

        setupViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        FragmentStatePagerAdapter adapter = new FragmentStatePagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new StepOne(), "Launch Android Studio");
        adapter.addFragment(new StepTwo(), "Figure Out Whats Wrong");
        adapter.addFragment(new StepThree(), "Enjoy New App");
        viewPager.setAdapter(adapter);
    }

    public void setViewPager(int fragmentNumber) {
        viewPager.setCurrentItem(fragmentNumber);
    }

}
