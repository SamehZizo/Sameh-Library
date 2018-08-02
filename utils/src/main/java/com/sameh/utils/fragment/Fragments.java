package com.sameh.utils.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;

public class Fragments {

    public static void change(Activity activity , Fragment fragment , int frame){

        FragmentTransaction fragmentTransaction = activity.getFragmentManager().beginTransaction();
        fragmentTransaction.replace(frame,fragment);
        fragmentTransaction.commit();

    }

}
