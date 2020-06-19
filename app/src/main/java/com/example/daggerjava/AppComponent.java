package com.example.daggerjava;

import dagger.Component;

@Component(modules = {DiselEnginModule.class,
        WheelsModule.class})
public interface AppComponent {
    Car getCar();
    void inject(MainActivity activity);
}
