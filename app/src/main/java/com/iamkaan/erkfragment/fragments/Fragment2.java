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
public class Fragment2 extends Fragment implements View.OnClickListener {
    FragmentButtonClickListener fragmentButtonClickListener;
    TextView title;

    public Fragment2() {
    }

    public static Fragment2 newInstance(FragmentButtonClickListener fragmentButtonClickListener) {
        Fragment2 fragment = new Fragment2();
        fragment.fragmentButtonClickListener = fragmentButtonClickListener;
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_two, container, false);

        title = (TextView) rootView.findViewById(R.id.title);
        Button buttonBlueLight = (Button) rootView.findViewById(R.id.buttonBlueLight);

        buttonBlueLight.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View v) {
        fragmentButtonClickListener.onBlueLightButtonClick();
    }

    public void setText(String title) {
        this.title.setText(title);
    }
}