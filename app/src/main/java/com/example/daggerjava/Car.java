package com.example.daggerjava;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    @Inject
    Engine engine;
    Wheels wheels;

    @Inject
    public Car(Wheels wheels) {
        this.wheels = wheels;
        Log.d(TAG, "car created");
    }

    @Inject
    public void drive() {
        Log.d(TAG, "driving");
    }
}
