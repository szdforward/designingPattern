package _1simpleFactory;

/**
 * 简单工厂模式
 * 简单工厂的测试
 */
public class Main {
    public static void main(String[] args) {
        try {
            Fruit apple = FruitFactory.getFruit("_1simpleFactory.Apple");
            Fruit banana = FruitFactory.getFruit("_1simpleFactory.Banana");
            apple.get();
            banana.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
