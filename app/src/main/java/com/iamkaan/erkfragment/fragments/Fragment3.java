package com.iamkaan.erkfragment.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.iamkaan.erkfragment.R;
import com.iamkaan.erkfragment.listeners.FragmentButtonClickListener;

/**
 * A placeholder fragment containing a simple view.
 */
public class Fragment3 extends Fragment implements View.OnClickListener{
    FragmentButtonClickListener fragmentButtonClickListener;
    TextView fragmentNumber;

    public Fragment3() {
    }

    public static Fragment3 newInstance(FragmentButtonClickListener fragmentButtonClickListener) {
        Fragment3 fragment = new Fragment3();
        fragment.fragmentButtonClickListener = fragmentButtonClickListener;
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_three, container, false);

        fragmentNumber = (TextView) rootView.findViewById(R.id.fragmentNumber);
        Button buttonGreen = (Button) rootView.findViewById(R.id.buttonGreen);

        buttonGreen.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View v) {
        fragmentButtonClickListener.onGreenButtonClick();
    }

    public void setText(String fragmentNumber) {
        this.fragmentNumber.setText(fragmentNumber);
    }
}