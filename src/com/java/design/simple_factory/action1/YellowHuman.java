package com.java.design.simple_factory.action1;

/**
 * Created by zihuatanejo on 16/8/8.
 */
public class YellowHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黄色人种的皮肤颜色是黄色的！");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种会说话，一般是双字节的");
    }
}
