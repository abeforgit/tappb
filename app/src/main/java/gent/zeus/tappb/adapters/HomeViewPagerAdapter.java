package gent.zeus.tappb.adapters;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import gent.zeus.tappb.ui.HomeScreenFragment;
import gent.zeus.tappb.ui.OrderPageFragment;

public class HomeViewPagerAdapter extends FragmentPagerAdapter {


    public HomeViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 2;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 1) {
            return new OrderPageFragment();
        } else {
            return new HomeScreenFragment();
        }
    }

}
