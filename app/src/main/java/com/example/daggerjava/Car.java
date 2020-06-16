package com.example.daggerjava;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    private Engine engine;

    @Inject
    public Car(Engine engine) {
        this.engine = engine;
        Log.d(TAG, "car created");
    }

    public void drive() {
        Log.d(TAG, "driving");
    }
}
