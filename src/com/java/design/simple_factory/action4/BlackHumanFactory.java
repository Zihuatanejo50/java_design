package com.java.design.simple_factory.action4;

/**
 * Created by zihuatanejo on 16/8/9.
 */
public class BlackHumanFactory extends AbstractHumanFactory{

    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
