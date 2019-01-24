package _2FactoryMethod;

/**
 * 工厂方法模式（多态工厂模式）
 * 工厂方法的测试
 */
public class Main {
    public static void main(String[] args) {
        try {
            FruitFactory appleFactory = new AppleFactory();
            FruitFactory bananaFactory = new BananaFactory();
            Fruit apple = appleFactory.getFruit();
            Fruit banana = bananaFactory.getFruit();
            apple.get();
            banana.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
