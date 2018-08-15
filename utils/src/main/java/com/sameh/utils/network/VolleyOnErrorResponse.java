package com.sameh.utils.network;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.sameh.utils.R;
import com.sameh.utils.custom.CustomProgressDialog;

public class VolleyOnErrorResponse implements Response.ErrorListener {

    private Context context;
    private CustomProgressDialog customProgressDialog;

    public VolleyOnErrorResponse(Context context , CustomProgressDialog customProgressDialog) {
        this.context = context;
        this.customProgressDialog = customProgressDialog;
    }

    @Override
    public void onErrorResponse(VolleyError error) {
        customProgressDialog.cancel();
        Toast.makeText(context, R.string.loading_data_error, Toast.LENGTH_SHORT).show();
        Log.d("Volley Error",error.getMessage());
    }
}
