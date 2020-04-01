package com.sampleguice.services;

import javax.inject.Named;

import com.google.inject.Inject;

public class DrawCircle implements DrawShape {

    int radius;

    @Inject
    public DrawCircle(@Named("Speed") int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle of radius " + radius + " !..");

    }

}