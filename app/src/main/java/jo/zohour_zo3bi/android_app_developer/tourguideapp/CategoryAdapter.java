package jo.zohour_zo3bi.android_app_developer.tourguideapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class CategoryAdapter extends FragmentStatePagerAdapter {

    private final int NUMBER_PAGES = 5; // the total number of pages
    private Context mContext;

    public CategoryAdapter(Context context, @NonNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mContext = context;
    }//end constructor

    @NonNull
    @Override
    public Fragment getItem(int position) {
        // link a specified fragment to each page in the pager view
        switch (position) {
            case 0:
                return new OverviewFragment();
            case 1:
                return new AttractionsFragment();
            case 2:
                return new HotelsFragment();
            case 3:
                return new RestaurantsFragment();
            case 4:
                return new DivingFragment();
            default:
                return null;
        }//end switch
    }//end getItem()

    @Override
    public int getCount() {
        return NUMBER_PAGES;
    }//end getCount()

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        // Name each page within the pager view
        switch (position) {
            case 0:
                return mContext.getString(R.string.overview_tab_name);
            case 1:
                return mContext.getString(R.string.attractions_tab_name);
            case 2:
                return mContext.getString(R.string.hotels_tab_name);
            case 3:
                return mContext.getString(R.string.restaurants_tab_name);
            case 4:
                return mContext.getString(R.string.diving_tab_name);
            default:
                return null;
        }//end switch
    }//end getPageTitle()
}//end CategoryAdapter class
