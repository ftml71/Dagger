package com.example.daggerjava;

import dagger.Module;
import dagger.Provides;

@Module
public class DiselEnginModule {
    private final int horsePower;

    public DiselEnginModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    Engine provideEngin() {
        return new DiselEngine(horsePower);
    }
}
