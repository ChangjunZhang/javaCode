package top.wordcount.java.patterns.simpleFactory;

import top.wordcount.java.patterns.simpleFactory.impl.Car;
import top.wordcount.java.patterns.simpleFactory.impl.Tv;

/**
 * 这样的实现有个问题，如果我们新增产品类的话，需要不断的在工厂类中新增case，
 * 这样需要修改的地方比较多，所以不建议使用这样的方法来实现工厂类。
 */
public class ProductFactory {
    public static Product produce(String productName) throws Exception {
        switch (productName) {
            case "tv":
                return new Tv();
            case "car":
                return new Car();
            default:
                throw new Exception("没有该产品");
        }
    }

}
