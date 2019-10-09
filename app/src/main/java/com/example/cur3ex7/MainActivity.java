package com.example.cur3ex7;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private CustomFragmentPA  mCustomFragmentPA ;
     private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment1 fragment1 = Fragment1.newInstance(null);
        Fragment2 fragment2 = Fragment2.newInstance(null);
        Fragment3 fragment3 = Fragment3.newInstance(null);
        mCustomFragmentPA = new CustomFragmentPA(getSupportFragmentManager());
        mCustomFragmentPA.addFragment(fragment1, "tab1");
        mCustomFragmentPA.addFragment(fragment2, "tab2");
        mCustomFragmentPA.addFragment(fragment3, "tab3");

        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mViewPager.setAdapter(mCustomFragmentPA);


        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }


}
