package com.java.design.abstract_factory.action1;

/**
 * Created by zihuatanejo on 16/8/9.
 */
public class NvWa {

    public static void main(String[] args){

        MaleHumanFactory malehumanFactory = new MaleHumanFactory();

        FemaleHumanFactory femaleHumanFactory = new FemaleHumanFactory();

        Human maleYellowHuman = malehumanFactory.createYellowHuman();
        maleYellowHuman.getColor();
        maleYellowHuman.talk();
        maleYellowHuman.getSex();

        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        femaleYellowHuman.getColor();
        femaleYellowHuman.talk();
        femaleYellowHuman.getSex();

    }
}
