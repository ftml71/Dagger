package com.example.daggerjava;

import android.util.Log;

import javax.inject.Inject;

public class DiselEngine implements Engine {
    private static final String TAG = "Dagger2 DiselEngine";

    @Inject
    public DiselEngine() {
        Log.d(TAG, "DiselEngine created");
    }

    @Override
    public void start() {
        Log.d(TAG, "DiselEngine started");
    }
}
