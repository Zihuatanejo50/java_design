package com.java.design.simple_factory.action2;

/**
 * Created by zihuatanejo on 16/8/8.
 */
public abstract class Creactor {

    public abstract <T extends Product> T createProduct(Class<T> clazz);

}
