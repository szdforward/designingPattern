package _13bridge;

/**
 * Created by Administrator on 下午 7:28.
 */
public abstract class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public abstract void installEngine();
}
