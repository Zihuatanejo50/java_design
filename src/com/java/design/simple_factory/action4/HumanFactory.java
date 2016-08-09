package com.java.design.simple_factory.action4;

/**
 * Created by zihuatanejo on 16/8/8.
 */
public class HumanFactory {

    public static Human createHuman(Class<? extends Human> clazz) {
        Human human = null;
        try {
            human = (Human) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("生成人种错误!");
        }
        return human;
    }
}
