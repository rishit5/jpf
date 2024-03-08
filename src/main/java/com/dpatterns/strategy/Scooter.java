package com.dpatterns.strategy;

import com.dpatterns.strategy.startingprocedure.StartingProcedure;

public class Scooter implements Bike {

    StartingProcedure startingProcedure;

    public Scooter(StartingProcedure startingProcedure) {
        this.startingProcedure = startingProcedure;
    }

    @Override
    public void startingProcedure() {
        startingProcedure.startingProcedure();
    }
}
