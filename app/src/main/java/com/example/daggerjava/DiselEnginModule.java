package com.example.daggerjava;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class DiselEnginModule {
    @Binds
    abstract Engine provideEngin(DiselEngine diselEngine);
}
