package top.wordcount.java.patterns.simpleFactory.impl;

import top.wordcount.java.patterns.simpleFactory.Product;

public class Car implements Product {
    public Car(){
        System.out.println("汽车被制造了");
    }
}
