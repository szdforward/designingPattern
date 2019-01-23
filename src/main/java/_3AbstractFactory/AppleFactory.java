package _3AbstractFactory;

/**
 * Created by Administrator on 下午 10:39.
 */
public class AppleFactory implements FruitFactory {
    @Override
    public Fruit getNorth() {
        return new NorthApple();
    }

    @Override
    public Fruit getSourch() {
        return new SourthApple();
    }
}
