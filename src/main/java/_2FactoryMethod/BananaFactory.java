package _2FactoryMethod;

/**
 * Created by Administrator on 下午 10:40.
 */
public class BananaFactory  implements FruitFactory{
    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
