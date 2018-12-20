package top.wordcount.java.patterns.decorator;

import top.wordcount.java.patterns.decorator.inter.Shape;


public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    /**
     * 调用原类方法的同时增加新的操作
     */
    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
