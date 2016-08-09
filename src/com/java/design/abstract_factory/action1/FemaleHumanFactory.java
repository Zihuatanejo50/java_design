package com.java.design.abstract_factory.action1;

/**
 * Created by zihuatanejo on 16/8/9.
 */
public class FemaleHumanFactory implements HumanFactory{

    @Override
    public Human createYellowHuman() {
        return new FemaleYellowMan();
    }

    @Override
    public Human createWhiteHuman() {
        return null;
    }

    @Override
    public Human createBlackHuman() {
        return null;
    }
}
