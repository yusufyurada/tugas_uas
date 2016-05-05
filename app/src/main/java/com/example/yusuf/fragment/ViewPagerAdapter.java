package com.example.yusuf.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;

/**
 * Created by YUSUF on 4/29/2016.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> fragments = new ArrayList<>();
    ArrayList<String> Tabtitles = new ArrayList<>();


    public void addFragments(Fragment fragments,String titles){
        this.fragments.add(fragments);
        this.Tabtitles.add(titles);
    }
    public ViewPagerAdapter(FragmentManager fm){
        super (fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    public CharSequence getPageTitle(int position){
        return Tabtitles.get(position);
    }
}
