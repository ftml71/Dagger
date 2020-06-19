package com.example.daggerjava;

import android.util.Log;

import javax.inject.Inject;

public class DiselEngine implements Engine {
    private static final String TAG = "Dagger2 DiselEngine";
    private final int horsePower;

    @Inject
    public DiselEngine(int horsePower) {
        this.horsePower = horsePower;
        Log.d(TAG, "DiselEngine created");
    }

    @Override
    public void start() {
        Log.d(TAG, "DiselEngine started , horsePower = " + horsePower);
    }
}
