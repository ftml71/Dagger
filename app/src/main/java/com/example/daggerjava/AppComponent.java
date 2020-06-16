package com.example.daggerjava;

import dagger.Component;

@Component
public interface AppComponent {
    Car getCar();
    void inject(MainActivity activity);
}
