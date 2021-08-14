package com.example.android126hw;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;


public class ThirdFragment extends Fragment {
    private ViewPagerAdapter adapter;
    private ArrayList<Fragment> list;
    private ViewPager2 viewPager2;
    private TabLayout tabLayout;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_third, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initVp(view);
    }

    private void createList() {
        list=new ArrayList<>();
        list.add(new PostFragment());
        list.add(new PostSecondFragment());
    }

    private void initVp(View view) {
        viewPager2=view.findViewById(R.id.viewPg1);
        adapter=new ViewPagerAdapter(this);
        adapter.setList(list);
        viewPager2.setAdapter(adapter);
        tabLayout=view.findViewById(R.id.tabs);
        new TabLayoutMediator(tabLayout,viewPager2,
        new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setIcon(R.drawable.ic_grid +(position));
            }

        }).attach();
    }

}