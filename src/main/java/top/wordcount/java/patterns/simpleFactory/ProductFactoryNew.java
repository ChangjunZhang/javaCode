package top.wordcount.java.patterns.simpleFactory;

import java.util.Map;

/**
 * 全新的工厂类，读取配置文件中的属性动态加载
 */
public class ProductFactoryNew {
    public static Product produce(String key) throws Exception {
        PropertyReader reader = new PropertyReader();
        Map<String, String> map = reader.readPropertyFile("product.properties");
        try {
            Product product = (Product) Class.forName(map.get(key)).newInstance();
            return product;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        throw new Exception("没有该产品");
    }

}
