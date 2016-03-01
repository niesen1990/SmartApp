package com.cmbb.smartkids.framework.utils;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.cmbb.smartkids.framework.utils.log.Log;


public class ExitBroadcast extends BroadcastReceiver {
    //退出整个apk
    private static final String TAG = ExitBroadcast.class.getSimpleName();
    Activity activity = null;

    public ExitBroadcast(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "程序退出");
        if (null != activity) {
            activity.finish();
        }
    }
}
