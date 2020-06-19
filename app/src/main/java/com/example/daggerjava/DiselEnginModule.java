package com.example.daggerjava;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DiselEnginModule {
    @Provides
    abstract Engine provideEngin(DiselEngine diselEngine);
}
