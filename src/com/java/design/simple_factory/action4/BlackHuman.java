package com.java.design.simple_factory.action4;

/**
 * Created by zihuatanejo on 16/8/8.
 */
public class BlackHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黑色人种的皮肤颜色是黑色的！");
    }

    @Override
    public void talk() {
        System.out.println("黑色人种会说话，一般听不懂。");
    }
}
