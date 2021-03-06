package com.java.design.simple_factory.action1;

/**
 * Created by zihuatanejo on 16/8/8.
 */
public class HumanFactory extends AbstractHumanFactory {

    private Human human;

    @Override
    public <T extends Human> T createHuman(Class<T> clazz) {
        Human human = null;
        try {
            human = (Human) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("生成人种错误!");
        }
        return (T) human;
    }
}
