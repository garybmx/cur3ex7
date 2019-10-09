package com.example.cur3ex7;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class Fragment2 extends Fragment {
    FrameLayout containerFrame;
    FragmentEmail frEmail;
    FagmentMusic frMusic;
    FagmentFavorites frFavorites;
    FragmentManager mFragmentManager;

    public static Fragment2 newInstance(Bundle bundle) {
        Fragment2 currentFragment = new Fragment2();
        Bundle args = new Bundle();
        args.putBundle("gettedArgs", bundle);
        currentFragment.setArguments(args);
        return currentFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_2, container, false);
        containerFrame = (FrameLayout) rootView.findViewById(R.id.containerFrame);
        frEmail = FragmentEmail.newInstance(null);
        frMusic = FagmentMusic.newInstance(null);
        frFavorites = FagmentFavorites.newInstance(null);
        mFragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.containerFrame, frEmail);
        fragmentTransaction.commit();
        BottomNavigationView bnv = (BottomNavigationView) rootView.findViewById(R.id.bnv);
        bnv.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_email:
                                FragmentTransaction fragmentTransactionE = mFragmentManager.beginTransaction();
                                fragmentTransactionE.replace(R.id.containerFrame, frEmail);
                                fragmentTransactionE.commit();
                                return true;
                            case R.id.action_music:
                                FragmentTransaction fragmentTransactionM = mFragmentManager.beginTransaction();
                                fragmentTransactionM.replace(R.id.containerFrame, frMusic);
                                fragmentTransactionM.commit();
                                return true;
                            case R.id.action_favorites:
                                FragmentTransaction fragmentTransactionF = mFragmentManager.beginTransaction();
                                fragmentTransactionF.replace(R.id.containerFrame, frFavorites);
                                fragmentTransactionF.commit();
                                return true;
                        }
                        return false;
                    }
                });
        return rootView;
    }





}
