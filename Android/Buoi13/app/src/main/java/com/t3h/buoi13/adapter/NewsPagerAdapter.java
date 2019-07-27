package com.t3h.buoi13.adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class NewsPagerAdapter extends FragmentPagerAdapter {
    private Fragment[] data;

    public NewsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void setData(Fragment[] data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public Fragment getItem(int position) {
        return data[position];
    }

    @Override
    public int getCount() {
        return data == null ? 0 : data.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "News";
            case 1:
                return "Saved";
            default:
                return "Favorite";
        }
    }
}
