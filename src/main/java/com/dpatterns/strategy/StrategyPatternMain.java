package com.dpatterns.strategy;

import com.dpatterns.strategy.startingprocedure.KickStartingProcedure;
import com.dpatterns.strategy.startingprocedure.SelfStartingProcedure;

public class StrategyPatternMain {
    public static void main(String[] args) {

        MotorCycle motorCycle = new MotorCycle(new KickStartingProcedure());
        Scooter scooter = new Scooter(new SelfStartingProcedure());

        motorCycle.startingProcedure();
        scooter.startingProcedure();
    }
}
