package com.sampleguice.services;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Hello world!
 */
public final class App {
    // private App() {
    // }

    // /**
    //  * Says hello to the world.
    //  * @param args The arguments of the program.
    //  */
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AbstractBinder(40, 36));
        ServiceRequester drawReqeuster1 = injector.getInstance(ServiceRequester.class);
        drawReqeuster1.makeReqeust();

        ServiceRequester drawReqeuster2 = injector.getInstance(ServiceRequester.class);
        drawReqeuster2.makeReqeust();

        boolean areDrawRequesterInstancesEqual = drawReqeuster1.equals(drawReqeuster2);
        System.out.println(areDrawRequesterInstancesEqual);
    }
}
