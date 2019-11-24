package com.ilham.myfoodcatalogue.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.ilham.myfoodcatalogue.fragment.FragmentDrink;
import com.ilham.myfoodcatalogue.fragment.FragmentFood;

public class PagerAdapter extends FragmentStatePagerAdapter {

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0: return new FragmentFood();
            case 1: return new FragmentDrink();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int i){
        switch (i){
            case 0: return "Food";
            case 1: return "Drink";
            default: return null;
        }
    }
}
