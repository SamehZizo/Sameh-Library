package com.sameh.utils.custom;

import android.content.Context;
import android.widget.Toast;

public class CustomToast extends Toast {

    private Context context;

    public CustomToast(Context context) {
        super(context);
        this.context = context;
    }

    public void show(String text){
        makeText(context,text,Toast.LENGTH_SHORT).show();
    }

    public void show(int id){
        makeText(context,id,Toast.LENGTH_SHORT).show();
    }
}
