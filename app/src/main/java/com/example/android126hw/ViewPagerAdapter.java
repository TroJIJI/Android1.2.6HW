package com.example.android126hw;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentStateAdapter {
    private ArrayList<Fragment> list;


    public ViewPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    public void setList(ArrayList<Fragment> list) {
        this.list = new ArrayList<>();
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position){
            case 0:
                return new PostFragment();
            case 1:
                return new PostSecondFragment();
            default:
                return  new PostFragment();
        }


    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
