package com.bootcamp.smsblocker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class SmsReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context,"SmS Recieved",Toast.LENGTH_SHORT).show();

    }


}
