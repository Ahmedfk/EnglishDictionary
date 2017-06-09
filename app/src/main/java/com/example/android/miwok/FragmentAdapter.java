package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by AhmedFareed on 18/03/2017.
 */

public class FragmentAdapter extends FragmentPagerAdapter {

    private String[] tabTitles = new String[] {"numbers", "family", "colors", "phrases"};
    private Context mcontext;

    public FragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        mcontext = context;
    }


    @Override
    public Fragment getItem(int position) {


        if(position == 0) {
            return new NumbersFragment();
        }else if( position == 1 ){
            return new FamilyFragment();
        }else if (position == 2){
            return new ColorsFragment();
        }else{
            return new PhrasesFragmt();
        }
    }


    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}

