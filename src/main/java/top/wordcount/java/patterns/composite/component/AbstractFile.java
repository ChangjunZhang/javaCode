package top.wordcount.java.patterns.composite.component;

/**
 * 抽象构件
 * 它可以是接口或抽象类，为叶子构件和容器构件对象声明接口，
 * 在该角色中可以包含所有子类共有行为的声明和实现。在抽象构件中定义了访问及管理它的子构件的方法，
 * 如增加子构件、删除子构件、获取子构件等。
 */
public abstract class AbstractFile {
    public abstract void add(AbstractFile file);
    public abstract void remove(AbstractFile file);
    public abstract AbstractFile getChild(int i);
    public abstract void killVirus();
}
