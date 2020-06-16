package com.example.daggerjava;

import android.util.Log;

import javax.inject.Inject;


public class Engine {
    public static final String TAG = "Engine";

    @Inject
    public Engine() {
        Log.d(TAG, "engine created");

    }
}
