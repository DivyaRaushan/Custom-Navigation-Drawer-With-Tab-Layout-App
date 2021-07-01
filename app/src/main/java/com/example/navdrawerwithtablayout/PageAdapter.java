package com.example.navdrawerwithtablayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter  {
    private int tabnumber;

    public PageAdapter(@NonNull  FragmentManager fm, int behavior, int tabnumber) {
        super(fm, behavior);
        this.tabnumber = tabnumber;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position)
        {
            case 0:return new FragmentOne();
            case 1:return new FragmentTwo();
            case 2:return new FragmentThree();
            default:return null;
        }
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
