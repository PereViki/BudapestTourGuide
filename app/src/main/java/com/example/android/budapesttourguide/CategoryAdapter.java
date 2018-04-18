package com.example.android.budapesttourguide;

import android.app.Application;
import android.content.Context;
import android.renderscript.Sampler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    private Context context;
    private String tabTitles[];

    //private String tabTitles[] = new String[] { context.getString (R.string.category_sights), context.getString(R.string.category_museums),
    //       context.getString(R.string.category_food),context.getString(R.string.category_hotels) };

    public CategoryAdapter(FragmentManager fm, Context context, String tabTitles[]) {
        super(fm);
        this.context = context;
        this.tabTitles = tabTitles;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SightsFragment();
        } else if (position == 1) {
            return new MuseumsFragment();
        } else if (position == 2) {
            return new FoodFragment();
        } else {
            return new HotelsFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
