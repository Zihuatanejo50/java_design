package com.java.design.simple_factory.action1;

/**
 * Created by zihuatanejo on 16/8/8.
 */
public class NvWa {

    public static void main(String[] args) {

        HumanFactory factory = new HumanFactory();

        //生产白色人种了
        Human whiteHuman = factory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        //生产黑色人种了
        Human blackHuman = factory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        //生产黑色人种了
        Human yellowHuman = factory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();

    }
}
