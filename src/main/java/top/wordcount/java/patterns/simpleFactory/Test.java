package top.wordcount.java.patterns.simpleFactory;

public class Test {
    public static void main(String[] args) {
        try {
            ProductFactory.produce("car");
            ProductFactoryNew.produce("car");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
