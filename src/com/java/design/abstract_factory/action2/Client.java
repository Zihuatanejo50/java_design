package com.java.design.abstract_factory.action2;

/**
 * Created by zihuatanejo on 16/8/9.
 */
public class Client {
    
    public static void main(String[] args){
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();

        AbstractProductA a1 = creator1.createProductA();
        AbstractProductB b1 = creator1.createProductB();

        AbstractProductA a2 = creator2.createProductA();
        AbstractProductB b2 = creator2.createProductB();

    }
}
