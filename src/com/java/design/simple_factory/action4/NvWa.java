package com.java.design.simple_factory.action4;

/**
 * Created by zihuatanejo on 16/8/8.
 */
public class NvWa {

    public static void main(String[] args) {

        HumanFactory factory = new HumanFactory();

        //生产白色人种了
        Human whiteHuman = new WhiteHumanFactory().createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();

        //生产黑色人种了
        Human blackHuman = new BlackHumanFactory().createHuman();
        blackHuman.getColor();
        blackHuman.talk();

        //生产黑色人种了
        Human yellowHuman = new YellowHumanFactory().createHuman();
        yellowHuman.getColor();
        yellowHuman.talk();

    }
}
