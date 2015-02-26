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
public class Fragment1 extends Fragment implements View.OnClickListener {
    FragmentButtonClickListener fragmentButtonClickListener;
    TextView colorCode;

    public Fragment1() {
    }

    public static Fragment1 newInstance(FragmentButtonClickListener fragmentButtonClickListener) {
        Fragment1 fragment = new Fragment1();
        fragment.fragmentButtonClickListener = fragmentButtonClickListener;
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_one, container, false);

        colorCode = (TextView) rootView.findViewById(R.id.colorCode);
        Button buttonBlueGrey = (Button) rootView.findViewById(R.id.buttonBlueGrey);

        buttonBlueGrey.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View v) {
        fragmentButtonClickListener.onBlueGreyButtonClick();
    }

    public void setText(String colorCode) {
        this.colorCode.setText(colorCode);
    }
}