package com.sameh.utils.custom;

import android.app.ProgressDialog;
import android.content.Context;

public class CustomProgressDialog extends ProgressDialog {

    private Context context;

    public CustomProgressDialog(Context context) {
        super(context);
        this.context = context;
    }

    public void start(String message) {
        this.setCancelable(false);
        this.setMessage(message);
        this.show();
    }

    public void start(int message) {
        this.setCancelable(false);
        this.setMessage(context.getResources().getString(message));
        this.show();
    }
}
