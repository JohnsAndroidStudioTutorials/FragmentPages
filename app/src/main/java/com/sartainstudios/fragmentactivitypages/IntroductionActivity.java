package com.sartainstudios.fragmentactivitypages;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created August 22nd, 2017 by John Sartain for the purpose of education.
 * Please feel free to reuse, repurpose, redistribute this code.
 */
public class IntroductionActivity extends AppCompatActivity {

    // Declaring a ViewPager
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        // Find and define the fragment container (ViewPager) that is located in activity_introduction
        viewPager = (ViewPager) findViewById(R.id.fragmentContainerViewPager);

        // Pass the view pager we defined to the setupViewPager method we created
        setupViewPager(viewPager);
    }

    //
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
