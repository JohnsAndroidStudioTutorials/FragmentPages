package com.sartainstudios.fragmentactivitypages;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
/**
 * Created August 22nd, 2017 by John Sartain for the purpose of education.
 * Please feel free to reuse, repurpose, redistribute this code.
 */

public class StepTwo extends Fragment {
    Button nextButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_step_two, container, false);

        nextButton = (Button) view.findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((IntroductionActivity) getActivity()).setViewPager(2);
            }
        });
        return view;
    }
}