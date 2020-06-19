package com.example.daggerjava;

import android.util.Log;

public class Tire {
    public static final String TAG ="Dagger2 Tire";
    public Tire() {
        Log.d(TAG, "Tire Created");
    }

    public void inflate() {
        Log.d(TAG, "Tire inflated");
    }
}
