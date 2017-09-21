package com.sartainstudios.fragmentactivitypages;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class StepThree extends Fragment {
    private static final String TAG = "WhatsWrong(3)";
    Button nextButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // TODO delete        return super.onCreateView(inflater, container, savedInstanceState);
        Log.d(TAG, "Started");
        View view = inflater.inflate(R.layout.fragment_step_three, container, false);

        nextButton = (Button) view.findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((IntroductionActivity) getActivity()).setViewPager(0);
            }
        });
        return view;
    }
}