package com.sameh.utils.network;

import android.content.Context;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class VolleySingleTon {

    private static VolleySingleTon mySingleton;
    private RequestQueue requestQueue;
    private static Context mCtx;

    private VolleySingleTon(Context context){
        mCtx = context;
        requestQueue = getRequestQueue();
    }

    public RequestQueue getRequestQueue(){
        if (requestQueue == null){
            requestQueue = Volley.newRequestQueue(mCtx.getApplicationContext());
        }
        return requestQueue;
    }

    public static synchronized VolleySingleTon mInstance(Context context){
        if (mySingleton == null){
            mySingleton = new VolleySingleTon(context);
        }
        return mySingleton;
    }

    public <T> void addToRequestQueue(Request<T> request){
        requestQueue.add(request);
    }
}
