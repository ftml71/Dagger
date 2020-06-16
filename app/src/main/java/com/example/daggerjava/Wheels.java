package com.example.daggerjava;

import android.util.Log;

public class Wheels {
    public static final String TAG="Wheels";
    Tire tire;

    public Wheels(Tire tire) {
        this.tire = tire;
        Log.d(TAG, "Wheels Created");
    }
}
