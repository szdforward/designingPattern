package _1simpleFactory;

/**
 * 简单工厂模式
 */
public class FruitFactory {
    //根据传入的Class的具体的路径得到相应的对象
    public static Fruit getFruit(String fruit) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class aClass = Class.forName(fruit);
        return (Fruit) aClass.newInstance();
    }
}
