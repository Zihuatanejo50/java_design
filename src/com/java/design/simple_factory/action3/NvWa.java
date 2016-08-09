package com.java.design.simple_factory.action3;

/**
 * Created by zihuatanejo on 16/8/8.
 */
public class NvWa {

    public static void main(String[] args) {

        //生产白色人种了
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        //生产黑色人种了
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        //生产黑色人种了
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();

    }
}
