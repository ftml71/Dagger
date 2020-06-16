package com.example.daggerjava;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    @Inject
    Engine engine;

    @Inject
    public Car() {
        Log.d(TAG, "car created");
    }

    @Inject
    public void drive() {
        Log.d(TAG, "driving");
    }
}
