package _3AbstractFactory;

/**
 * 抽象工厂模式
 * 工厂方法的测试
 */
public class Main {
    public static void main(String[] args) {
        try {
            BananaFactory bananaFactory = new BananaFactory();
            AppleFactory appleFactory = new AppleFactory();
            Fruit northBanana = bananaFactory.getNorth();
            northBanana.get();
            Fruit sourthBanana = bananaFactory.getSourch();
            sourthBanana.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
