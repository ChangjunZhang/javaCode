package top.wordcount.java.patterns.decorator.impl;

import top.wordcount.java.patterns.decorator.inter.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}