package com.chris.illinibus.Notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by chrisfang on 11/30/16.
 */

public class BusReceiver extends BroadcastReceiver{
    public BusReceiver() {

    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent intent1 = new Intent(context, BusService.class);
        context.startService(intent1);
    }
}
