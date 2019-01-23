package _3AbstractFactory;

/**
 * Created by Administrator on 下午 10:40.
 */
public class BananaFactory  implements FruitFactory {
    @Override
    public Fruit getNorth() {
        return new NorthBanana();
    }

    @Override
    public Fruit getSourch() {
        return new SourthBanana();
    }
}
