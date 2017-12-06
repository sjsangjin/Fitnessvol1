package com.example.sjhan.healthai.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.sjhan.healthai.Tab1Fragment;
import com.example.sjhan.healthai.Tab2Fragment;
import com.example.sjhan.healthai.Tab3Fragment;
import com.example.sjhan.healthai.Tab4Fragment;


/**
 * Created by jikur on 2017-07-27.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {

    private int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int numOfTabs)
    {
        super(fm);
        this.mNumOfTabs=numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
                Tab1Fragment tab1 = new Tab1Fragment();
                return tab1;
            case 1:
                Tab2Fragment tab2 = new Tab2Fragment();
                return tab2;
            case 2:
                Tab3Fragment tab3 = new Tab3Fragment();
                return tab3;
            case 3:
                Tab4Fragment tab4 = new Tab4Fragment();
                return tab4;

        }


        return null;
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
