package top.wordcount.java.patterns.builder;

/**
 * Test 相当于验收方，不关心产品的构造过程，只需向director要产品即可
 */
public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();
        Architecture architecture = director.constructProduct(concreteBuilder);
        System.out.println(architecture.getBasic());
        System.out.println(architecture.getWall());
        System.out.println(architecture.getRoofed());
    }
}
