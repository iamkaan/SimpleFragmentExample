package com.iamkaan.erkfragment;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;

import com.iamkaan.erkfragment.fragments.Fragment1;
import com.iamkaan.erkfragment.fragments.Fragment2;
import com.iamkaan.erkfragment.fragments.Fragment3;
import com.iamkaan.erkfragment.listeners.FragmentButtonClickListener;


public class MainActivity extends ActionBarActivity implements FragmentButtonClickListener {
    Fragment1 fragment1;
    Fragment2 fragment2;
    Fragment3 fragment3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1 = Fragment1.newInstance(this);
        fragment2 = Fragment2.newInstance(this);
        fragment3 = Fragment3.newInstance(this);

        if (savedInstanceState == null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.fragment1, fragment1);
            ft.replace(R.id.fragment2, fragment2);
            ft.replace(R.id.fragment3, fragment3);
            ft.commit();
        }
    }

    @Override
    public void onBlueGreyButtonClick() {
        fragment1.setText(getString(R.string.blue_grey_code));
        fragment2.setText(getString(R.string.blue_grey_name));
        fragment3.setText(getString(R.string.blue_grey_fragment_number));
    }

    @Override
    public void onBlueLightButtonClick() {
        fragment1.setText(getString(R.string.grey_code));
        fragment2.setText(getString(R.string.grey_name));
        fragment3.setText(getString(R.string.grey_fragment_number));
    }

    @Override
    public void onGreenButtonClick() {
        fragment1.setText(getString(R.string.teal_code));
        fragment2.setText(getString(R.string.teal_name));
        fragment3.setText(getString(R.string.teal_fragment_number));
    }
}
