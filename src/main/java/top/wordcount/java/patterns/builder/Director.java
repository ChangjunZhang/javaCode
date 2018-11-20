package top.wordcount.java.patterns.builder;

/**
 * 指导构建复杂对象的过程，传入一个抽象构建类，依次调用抽象构建类的构建方法
 * 总指挥，指导先打地基再砌墙，最后封顶
 */
public class Director {

    public Architecture constructProduct(ConcreteBuilder concreteBuilder){
        concreteBuilder.buildBasic();
        concreteBuilder.buildWalls();
        concreteBuilder.roofed();
        return concreteBuilder.buildProduct();
    }
}
