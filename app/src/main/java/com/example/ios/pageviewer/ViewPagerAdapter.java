package com.example.ios.pageviewer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.ios.pageviewer.frags.frag1;
import com.example.ios.pageviewer.frags.frag2;
import com.example.ios.pageviewer.frags.frag3;

/**
 * Created by ios on 9/30/17.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position)
        {
            case 0:
                return new frag1();
            case 1:
                return new frag2();
            case 2:
                return new frag3();

        }
        return null;
    }

    @Override
    public int getCount() {
        //get number of fragments displayed
        return 3;
    }

    /*@Override
    public CharSequence getPageTitle(int position) {
        switch(position)
        {
            case 0:
                return "Frag 1";
            case 1:
                return "Frag 2";
            case 2:
                return "Frag 3";

        }

        return super.getPageTitle(position);
    }*/
}
