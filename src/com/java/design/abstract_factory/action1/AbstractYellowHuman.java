package com.java.design.abstract_factory.action1;

/**
 * Created by zihuatanejo on 16/8/9.
 */
public abstract class AbstractYellowHuman implements Human{

    @Override
    public void getColor() {
        System.out.println("黄色人的皮肤一般都是黄色的");
    }

    @Override
    public void talk() {
        System.out.println("黄色人说话一般都是双字节的");
    }
}
