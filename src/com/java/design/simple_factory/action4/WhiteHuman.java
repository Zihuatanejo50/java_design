package com.java.design.simple_factory.action4;

/**
 * Created by zihuatanejo on 16/8/8.
 */
public class WhiteHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("白色人种的皮肤颜色是白色的！");
    }

    @Override
    public void talk() {
        System.out.println("白色人种会说话，一般都是但是单字节。");
    }
}
