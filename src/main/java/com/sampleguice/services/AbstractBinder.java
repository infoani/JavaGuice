package com.sampleguice.services;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.name.Names;

import lombok.Getter;

public class AbstractBinder extends AbstractModule {

    @Getter
    private int circleBindParam;
    @Getter
    private int rectangleBindParam;

    AbstractBinder(int circleBindParam, int rectangleBindParam) {
        this.circleBindParam = circleBindParam;
        this.rectangleBindParam = rectangleBindParam;
    }
    
    @Override
    public void configure () {
        // bind(DrawShape.class).to(DrawCircle.class);
        bind(DrawShape.class).to(DrawRectangle.class).in(Singleton.class);
        bind(int.class).annotatedWith(Names.named("Speed")).toInstance(getCircleBindParam());
        bind(int.class).annotatedWith(EdgeValue.class).toInstance(getRectangleBindParam());
        bind(ServiceRequester.class).in(Singleton.class);
    }

    // @Provides
    // public DrawShape providesDrawShape() {
    //     return new DrawCircle(getCircleBindParam());
    // }
}