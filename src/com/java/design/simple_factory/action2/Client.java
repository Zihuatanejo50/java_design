package com.java.design.simple_factory.action2;

/**
 * Created by zihuatanejo on 16/8/8.
 */
public class Client {

    public static void main(String[] args){
        ConcreteCreactor creactor = new ConcreteCreactor();

        Product product1 = creactor.createProduct(ConcreteProduct1.class);
        product1.method1();
        product1.method2();

        Product product2 = creactor.createProduct(ConcreteProduct2.class);
        product2.method1();
        product2.method2();

    }

}
