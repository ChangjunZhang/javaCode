package top.wordcount.java.patterns.abstractFactory.impl;

import top.wordcount.java.patterns.abstractFactory.Car;
import top.wordcount.java.patterns.abstractFactory.Factory;
import top.wordcount.java.patterns.abstractFactory.Tv;

public class FactoryB implements Factory {
    @Override
    public Tv produceTv() {
        return new Sony();
    }

    @Override
    public Car produceCar() {
        return new Audi();
    }
}
