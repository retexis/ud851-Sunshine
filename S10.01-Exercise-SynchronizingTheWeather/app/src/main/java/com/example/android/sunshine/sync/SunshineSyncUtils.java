package com.example.android.sunshine.sync;

import android.content.Context;
import android.content.Intent;

// TODO DONE (9) Create a class called SunshineSyncUtils
    //  TODO DONE (10) Create a public static void method called startImmediateSync
    //  TODO DONE (11) Within that method, start the SunshineSyncIntentService
public class SunshineSyncUtils {

    public static void startImmediateSync(Context context) {
        Intent intentSyncsImmediately = new Intent(context, SunshineSyncIntentService.class);
        context.startService(intentSyncsImmediately);
    }
}