package com.java.design.simple_factory.action2;

/**
 * Created by zihuatanejo on 16/8/8.
 */
public class ConcreteCreactor extends Creactor {

    @Override
    public <T extends Product> T createProduct(Class<T> clazz) {
        Product product = null;
        try {
            product = (Product) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
