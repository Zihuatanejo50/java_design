package com.java.design.simple_factory.action6;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zihuatanejo on 16/8/9.
 */
public class Factory {

    private static final Map<String,Product> prMap = new HashMap<>();

    public static synchronized Product createProduct(String type){

        Product product = null;
        if(prMap.containsKey(type)){
            product = prMap.get(type);
        }else{
            if(type.equals("Product1")){
                product = new ConcreteProduct1();
            }else if(type.equals("Product2")){
                product = new ConcreteProduct2();
            }
            prMap.put(type,product);
        }
        return product;
    }
}
