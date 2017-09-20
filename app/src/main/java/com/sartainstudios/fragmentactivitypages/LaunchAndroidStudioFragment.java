package com.sartainstudios.fragmentactivitypages;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class LaunchAndroidStudioFragment extends Fragment {
    private static final String TAG = "LaunchAndroidStudio(1)";
    Button nextButton;
    Button homeButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // TODO delete        return super.onCreateView(inflater, container, savedInstanceState);
        Log.d(TAG, "Started");
        View view = inflater.inflate(R.layout.fragment_launch_android_studio, container, false);

      //  nextButton = (Button) view.findViewById(R.id.nextButton);

        return view;
    }
}