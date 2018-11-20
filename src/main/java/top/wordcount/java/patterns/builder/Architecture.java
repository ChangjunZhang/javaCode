package top.wordcount.java.patterns.builder;

/**
 * 1 builder:为创建一个产品对象的各个部件指定抽象接口。
 * 2 ConcreteBuilder:实现Builder的接口以构造和装配该产品的各个部件，定义并明确它所创建的表示，并提供一个检索产品的接口。
 * 3 Director:构造一个使用Builder接口的对象。
 * 4 Architecture:表示被构造的复杂对象。ConcreteBuilder创建该产品的内部表示并定义它的装配过程，
 *  包含定义组成部件的类，包括将这些部件装配成最终产品的接口。
 *
 *  被构造的复杂对象
 */
public class Architecture {
    private String basic;//地基

    private String wall;//墙

    private String roofed;//楼顶

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}
