package top.wordcount.java.patterns.composite.composite;

import top.wordcount.java.patterns.composite.component.AbstractFile;

import java.util.ArrayList;

/**
 * 它在组合结构中表示容器节点对象，容器节点包含子节点，其子节点可以是叶子节点，
 * 也可以是容器节点，它提供一个集合用于存储子节点，实现了在抽象构件中定义的行为，
 * 包括那些访问及管理子构件的方法，在其业务方法中可以递归调用其子节点的业务方法。
 */
public class Folder extends AbstractFile {
    //定义集合fileList，用于存储AbstractFile类型的成员
    private ArrayList<AbstractFile> fileList=new ArrayList<AbstractFile>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    public void add(AbstractFile file) {
        fileList.add(file);
    }

    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    public AbstractFile getChild(int i) {
        return (AbstractFile)fileList.get(i);
    }

    public void killVirus() {
        System.out.println("****对文件夹'" + name + "'进行杀毒");  //模拟杀毒

        //递归调用成员构件的killVirus()方法
        for(Object obj : fileList) {
            ((AbstractFile)obj).killVirus();
        }
    }
}
