package com.dpatterns.strategy.startingprocedure;

public class SelfStartingProcedure implements StartingProcedure {

    @Override
    public void startingProcedure() {
        System.out.println("Self starting!!!");
    }
}
