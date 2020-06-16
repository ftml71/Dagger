package com.example.daggerjava;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {
    @Provides
    Tire provideTire() {
        Tire tire = new Tire();
        tire.inflate();
        return tire;
    }

    @Provides
    Wheels provideWheels(Tire tire){
        return new Wheels(tire);
    }

}
