package com.example.arakjel.broadcastreceiverpoc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;


public class SecondBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Second Broadcast received", Toast.LENGTH_LONG).show();
    }
}
