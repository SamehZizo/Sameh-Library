package com.sameh.utils.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class Fragments {

    public static void change(Activity activity , Fragment fragment , int frame){

        FragmentTransaction fragmentTransaction = activity.getFragmentManager().beginTransaction();
        fragmentTransaction.replace(frame,fragment);
        fragmentTransaction.commit();

    }

    public static void change(AppCompatActivity activity , android.support.v4.app.Fragment fragment , int frame){

        android.support.v4.app.FragmentTransaction fragmentTransaction = activity.getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(frame,fragment);
        fragmentTransaction.commit();

    }

    public static void change(Activity activity , Fragment fragment , int frame , String TAG_NAME){

        FragmentTransaction fragmentTransaction = activity.getFragmentManager().beginTransaction();
        fragmentTransaction.replace(frame,fragment,TAG_NAME);
        fragmentTransaction.commit();

    }

    public static void change(AppCompatActivity activity , android.support.v4.app.Fragment fragment , int frame , String TAG_NAME){

        android.support.v4.app.FragmentTransaction fragmentTransaction = activity.getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(frame,fragment,TAG_NAME);
        fragmentTransaction.commit();

    }

    public static Fragment getFragment(Activity activity , String TAG_NAME){
        Fragment fragment = activity.getFragmentManager().findFragmentByTag(TAG_NAME);
        return fragment;
    }

    public static android.support.v4.app.Fragment getFragment(AppCompatActivity activity , String TAG_NAME){
        android.support.v4.app.Fragment fragment = activity.getSupportFragmentManager().findFragmentByTag(TAG_NAME);
        return fragment;
    }

}
