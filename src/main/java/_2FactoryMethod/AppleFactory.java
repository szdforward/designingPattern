package _2FactoryMethod;

/**
 * Created by Administrator on 下午 10:39.
 */
public class AppleFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
