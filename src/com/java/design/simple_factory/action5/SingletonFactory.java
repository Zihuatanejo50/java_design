package com.java.design.simple_factory.action5;

import android.test.SingleLaunchActivityTestCase;

import java.lang.reflect.Constructor;

/**
 * Created by zihuatanejo on 16/8/9.
 */
public class SingletonFactory {

    private static Singleton singleton;

    static {
        try {
            Class<?> clazz = Class.forName(Singleton.class.getName());
            Constructor<?> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton = (Singleton) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Singleton getSingleton(){
        return singleton;
    }
}
