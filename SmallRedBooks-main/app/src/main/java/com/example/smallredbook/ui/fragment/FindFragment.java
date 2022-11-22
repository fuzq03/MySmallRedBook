package com.example.smallredbook.ui.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.smallredbook.adapter.FindViewPagerAdapter;
import com.example.smallredbook.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class FindFragment extends Fragment {

    public FindFragment() {
        // Required empty public constructor
        Log.d("Here", "This is FindFragment constructor");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("Here", "This is FindFragment OnCreateView start init viewpager2");
        View view = inflater.inflate(R.layout.fragment_find, container, false);
        ViewPager2 viewPager2  = view.findViewById(R.id.find_view_pager);
        FindViewPagerAdapter adapter = new FindViewPagerAdapter(getActivity());
        viewPager2.setAdapter(adapter);
        Log.d("Here", "This is FindFragment OnCreateView finish init viewpager2");

        TabLayout tabLayout = view.findViewById(R.id.find_tab_layout);
        new TabLayoutMediator(tabLayout, viewPager2, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                if(position == 0){
                    tab.setText("推荐");
                }else if(position == 1){
                    tab.setText("购物");
                }
            }
        }).attach();



        return view;
    }
}