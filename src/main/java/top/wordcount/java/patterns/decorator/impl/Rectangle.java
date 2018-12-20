package top.wordcount.java.patterns.decorator.impl;

import top.wordcount.java.patterns.decorator.inter.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}