package com.sampleguice.services;

import com.google.inject.Inject;

import lombok.NonNull;

/**
 * ServiceRequester
 */
public class ServiceRequester {

    @NonNull
    private DrawShape d;
    // @Inject
    // DrawCircle c;

    // @Inject
    // public ServiceRequester (final DrawShape d) {
    //     this.d = d;
    // }


    public void makeReqeust() {
        d.draw();
    }

    @Inject
    public void setDrawShape(DrawShape d) {
        System.out.println("Set method was called");
        this.d = d;
    }
}