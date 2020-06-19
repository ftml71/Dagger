package com.example.daggerjava;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Dagger2 Car";

    Engine engine;
    Wheels wheels;

    @Inject
    public Car(Engine engine,Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;

        Log.d(TAG, "car created");
    }

    @Inject
    public void drive() {
        engine.start();
        Log.d(TAG, "driving");
    }
}
