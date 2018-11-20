package top.wordcount.java.patterns.builder;

/**
 * 具体的构建产品的类
 */
public class ConcreteBuilder implements Builder {
    private Architecture architecture;
    @Override
    public void buildBasic() {
        architecture.setBasic("打好地基是成功的必要基础");
    }

    @Override
    public void buildWalls() {
        architecture.setWall("砌墙，板砖");
    }

    @Override
    public void roofed() {
        architecture.setRoofed("封顶大吉");
    }

    @Override
    public Architecture buildProduct() {
      return architecture;
    }
}
