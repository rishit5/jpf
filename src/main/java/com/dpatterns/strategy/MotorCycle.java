package com.dpatterns.strategy;

import com.dpatterns.strategy.startingprocedure.StartingProcedure;

public class MotorCycle implements Bike {

    StartingProcedure startingProcedure;

    public MotorCycle(StartingProcedure startingProcedure) {
        this.startingProcedure = startingProcedure;
    }

    @Override
    public void startingProcedure() {
        startingProcedure.startingProcedure();
    }
}
