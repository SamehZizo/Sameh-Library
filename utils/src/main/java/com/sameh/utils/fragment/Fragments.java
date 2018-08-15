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

    public static void change(Activity activity , Fragment fragment , int frame , String TAG_NAME){

        FragmentTransaction fragmentTransaction = activity.getFragmentManager().beginTransaction();
        fragmentTransaction.replace(frame,fragment,TAG_NAME);
        fragmentTransaction.commit();

    }

    public static Fragment getFragment(Activity activity , String TAG_NAME){
        Fragment fragment = activity.getFragmentManager().findFragmentByTag(TAG_NAME);
        return fragment;
    }

}
