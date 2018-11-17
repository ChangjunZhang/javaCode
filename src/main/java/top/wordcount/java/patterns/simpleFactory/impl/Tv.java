package top.wordcount.java.patterns.simpleFactory.impl;

import top.wordcount.java.patterns.simpleFactory.Product;

public class Tv implements Product {
    public Tv() {
        System.out.println("电视被制造了");
    }
}
