package top.wordcount.java.patterns.composite.leaf;

import top.wordcount.java.patterns.composite.component.AbstractFile;

/**
 * 它在组合结构中表示叶子节点对象，叶子节点没有子节点，它实现了在抽象构件中定义的行为。
 * 对于那些访问及管理子构件的方法，可以通过异常等方式进行处理。
 */
public class ImageFile extends AbstractFile {
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    public void add(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    public void remove(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    public AbstractFile getChild(int i) {
        System.out.println("对不起，不支持该方法！");
        return null;
    }

    public void killVirus() {
        //模拟杀毒
        System.out.println("----对图像文件'" + name + "'进行杀毒");
    }
}
