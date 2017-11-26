package com.example.sjhan.healthai.Util;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by pc on 2017-08-02.
 */

public class ActivityUtil {
    public static void setActionBarColor(AppCompatActivity appCompatActivity, int colorId){
        ActionBar actionBar = appCompatActivity.getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(getColor(appCompatActivity, colorId));
        actionBar.setBackgroundDrawable(colorDrawable);
    }

    public static final int getColor(Context context, int id) {
        final int version = Build.VERSION.SDK_INT;
        if (version >= 23) {
            return ContextCompat.getColor(context, id);
        } else {
            return context.getResources().getColor(id);
        }
    }
}
