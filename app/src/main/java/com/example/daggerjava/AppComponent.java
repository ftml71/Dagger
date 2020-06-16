package com.example.daggerjava;

import dagger.Component;

@Component(modules = WheelsModule.class)
public interface AppComponent {
    Car getCar();
    void inject(MainActivity activity);
}
