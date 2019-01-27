package _13bridge;

/**
 * Created by Administrator on 下午 7:36.
 */
public class Jeep extends Car {
    public Jeep(Engine engine) {
        super(engine);
    }

    @Override
    public void installEngine() {
        System.out.println("jeep车安装发动机的型号为：" + getEngine().engineClass());
    }
}
