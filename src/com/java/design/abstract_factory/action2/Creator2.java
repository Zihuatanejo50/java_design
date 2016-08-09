package com.java.design.abstract_factory.action2;

/**
 * Created by zihuatanejo on 16/8/9.
 */
public class Creator2 extends AbstractCreator{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
