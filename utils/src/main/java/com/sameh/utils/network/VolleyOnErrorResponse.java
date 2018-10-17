package com.sameh.utils.network;

import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.widget.Toast;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.sameh.utils.R;
import com.sameh.utils.custom.CustomProgressDialog;

public class VolleyOnErrorResponse implements Response.ErrorListener {

    private Context context;
    private CustomProgressDialog customProgressDialog;
    private boolean logError;
    private SwipeRefreshLayout swipeRefreshLayout;

    public VolleyOnErrorResponse(Context context, SwipeRefreshLayout swipeRefreshLayout, boolean logError) {
        this.context = context;
        this.logError = logError;
        this.swipeRefreshLayout = swipeRefreshLayout;
    }

    public VolleyOnErrorResponse(Context context , CustomProgressDialog customProgressDialog , boolean logError) {
        this.context = context;
        this.customProgressDialog = customProgressDialog;
        this.logError = logError;
    }

    public VolleyOnErrorResponse(Context context, CustomProgressDialog customProgressDialog, SwipeRefreshLayout swipeRefreshLayout, boolean logError) {
        this.context = context;
        this.logError = logError;
        this.swipeRefreshLayout = swipeRefreshLayout;
        this.customProgressDialog = customProgressDialog;
    }

    @Override
    public void onErrorResponse(VolleyError error) {
        Toast.makeText(context, R.string.loading_data_error, Toast.LENGTH_SHORT).show();

        if (logError)
            Log.d("Volley Error",error.getMessage());

        if (customProgressDialog != null)
            customProgressDialog.cancel();

        if (swipeRefreshLayout != null)
            swipeRefreshLayout.setRefreshing(false);
    }
}
