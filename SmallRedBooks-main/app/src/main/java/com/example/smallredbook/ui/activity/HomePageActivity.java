package com.example.smallredbook.ui.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.util.Log;

import com.example.smallredbook.R;
import com.example.smallredbook.adapter.HomePageViewPagerAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class HomePageActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Here", "2222222222222222222");
        setContentView(R.layout.activity_home);
        Log.d("Here", "1111111111111111111");

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        //获取navController
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        //通过setupWithNavController
        NavigationUI.setupWithNavController(bottomNavigationView, navController);





    }
}