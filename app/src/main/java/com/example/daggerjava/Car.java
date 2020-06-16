package com.example.daggerjava;

import android.util.Log;

public class Car {
    private static final String TAG = "Car";
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
        Log.d(TAG, "car created");
    }

    public void drive() {
        Log.d(TAG, "driving");
    }
}
