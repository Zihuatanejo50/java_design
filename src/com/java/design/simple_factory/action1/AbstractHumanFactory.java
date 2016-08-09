package com.java.design.simple_factory.action1;

/**
 * Created by zihuatanejo on 16/8/8.
 */
public abstract class AbstractHumanFactory {

    public abstract <T extends Human> T createHuman(Class<T> clazz);
}
