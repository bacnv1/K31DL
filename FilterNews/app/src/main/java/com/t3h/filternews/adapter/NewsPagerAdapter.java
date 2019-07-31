package com.t3h.filternews.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class NewsPagerAdapter extends FragmentPagerAdapter {
    private Fragment[] fms;
    public NewsPagerAdapter(@NonNull FragmentManager fm, Fragment[] fms) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.fms = fms;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fms[position];
    }

    @Override
    public int getCount() {
        return fms.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "News";
            case 1:
                return "Saved";
            default:
                return "Favorite";
        }
    }
}
