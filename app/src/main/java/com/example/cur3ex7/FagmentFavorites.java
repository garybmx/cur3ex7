package com.example.cur3ex7;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FagmentFavorites extends Fragment {

    public static FagmentFavorites newInstance(Bundle bundle) {
        FagmentFavorites currentFragment = new FagmentFavorites();
        Bundle args = new Bundle();
        args.putBundle("gettedArgs", bundle);
        currentFragment.setArguments(args);
        return currentFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fr_fav, container, false);
        return rootView;
    }

}

