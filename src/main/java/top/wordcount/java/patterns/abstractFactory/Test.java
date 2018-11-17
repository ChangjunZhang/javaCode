package top.wordcount.java.patterns.abstractFactory;

import top.wordcount.java.patterns.abstractFactory.impl.FactoryA;
import top.wordcount.java.patterns.abstractFactory.impl.FactoryB;

/**
 * 抽象工厂模式测试
 */
public class Test {
    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        factoryA.produceCar();

        FactoryB factoryB = new FactoryB();
        factoryB.produceTv();
    }

}
