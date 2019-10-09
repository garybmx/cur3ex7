package com.example.cur3ex7;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FagmentMusic  extends Fragment {

    public static FagmentMusic newInstance(Bundle bundle) {
        FagmentMusic currentFragment = new FagmentMusic();
        Bundle args = new Bundle();
        args.putBundle("gettedArgs", bundle);
        currentFragment.setArguments(args);
        return currentFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fr_music, container, false);
        return rootView;
    }

}
