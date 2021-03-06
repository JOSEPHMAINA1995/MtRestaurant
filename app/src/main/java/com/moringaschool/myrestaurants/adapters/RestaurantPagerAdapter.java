package com.moringaschool.myrestaurants.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.moringaschool.myrestaurants.ui.RestaurantDetailFragment;
import com.moringaschool.myrestaurants.models.Business;

import java.util.ArrayList;
import java.util.List;

public class RestaurantPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Business> mRestaurants = new ArrayList<>();

    public RestaurantPagerAdapter(@NonNull FragmentManager fm, int behavior, ArrayList<Business> restaurants) {
        super(fm, behavior);
        mRestaurants = restaurants;
    }

//    @Override
//    public Fragment getItem(int position) {
//        return RestaurantDetailFragment.newInstance(mRestaurants.get(position));
//    }
    @Override
    public Fragment getItem(int position) {
        return RestaurantDetailFragment.newInstance(mRestaurants, position);
    }

    @Override
    public int getCount() {
        return mRestaurants.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mRestaurants.get(position).getName();
    }
}
