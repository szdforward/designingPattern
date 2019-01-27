package _13bridge;

/**
 * Created by Administrator on 下午 7:31.
 */
public class Bus extends Car {

    public Bus(Engine engine) {
        super(engine);
    }
    @Override
    public void installEngine() {
        System.out.println("bus车安装发动机的型号为："+ getEngine().engineClass());
    }
}
