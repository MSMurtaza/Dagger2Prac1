package com.example.dagger2prac1;

import dagger.Component;

@Component
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);
}
