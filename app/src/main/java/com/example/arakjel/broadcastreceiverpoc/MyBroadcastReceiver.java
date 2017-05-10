package com.example.arakjel.broadcastreceiverpoc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;


public class MyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "First Broadcast received", Toast.LENGTH_LONG).show();
    }
}
