package top.wordcount.java.patterns.decorator;

import top.wordcount.java.patterns.decorator.impl.Circle;
import top.wordcount.java.patterns.decorator.impl.Rectangle;
import top.wordcount.java.patterns.decorator.inter.Shape;

/**
 * 我们将创建一个 Shape 接口和实现了 Shape 接口的实体类。然后我们创建一个实现了 Shape 接口的抽象装饰类 ShapeDecorator，并把 Shape 对象作为它的实例变量。
 *
 * RedShapeDecorator 是实现了 ShapeDecorator 的实体类。
 *
 * DecoratorPatternDemo，我们的演示类使用 RedShapeDecorator 来装饰 Shape 对象。
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
