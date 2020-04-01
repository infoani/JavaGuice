package com.sampleguice.services;

import com.google.inject.Inject;

import lombok.Getter;

class DrawRectangle implements DrawShape {

    @Getter
    int rectangleSide;

    @Inject
    DrawRectangle (@EdgeValue int rectangleSide) {
        this.rectangleSide = rectangleSide;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle of side " + getRectangleSide() + " !..");
    }
    
}