package com.sameh.utils.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Date {

    public static String getDate (){

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss", Locale.US);
        String date = format.format(Calendar.getInstance().getTime());

        return date;
    }

    public static String getDateAsName (){

        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddkkmmss", Locale.US);
        String date = format.format(Calendar.getInstance().getTime());

        return date;
    }

}
