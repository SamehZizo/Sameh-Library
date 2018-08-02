package com.sameh.utils.shared_prefernce;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreference {

    public static boolean isLoggedIn(Context context){
        SharedPreferences logged = context.getSharedPreferences("Login",Context.MODE_PRIVATE);

        if (logged.getBoolean("isLoggedIn",false)){
            return true;
        }
        else {
            return false;
        }
    }

    public static void setIsLogged(Context context , boolean isLogged) {
        SharedPreferences setIsLogged = context.getSharedPreferences("Login", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = setIsLogged.edit();
        editor.putBoolean("isLoggedIn", isLogged);
        editor.commit();
    }
}
