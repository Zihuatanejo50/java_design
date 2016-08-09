package com.java.design.simple_factory.action5;

/**
 * Created by zihuatanejo on 16/8/9.
 */
public class Client {

    public static void main(String[] args){
        Singleton singleton = SingletonFactory.getSingleton();
        singleton.doSomething();
    }
}
