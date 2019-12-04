package com.example.dagger2prac1;

import javax.inject.Inject;

public class Wheels {
    // through no dependency, but to tell dagger
    // that in Car class, instead of creating new object
    // as boilerplate code,dagger knows how to create Engine
    // & Wheels object
    @Inject
    public Wheels() {
    }
}
