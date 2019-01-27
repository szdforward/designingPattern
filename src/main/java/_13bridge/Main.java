package _13bridge;

/**
 * Created by Administrator on 下午 7:37.
 * 桥接模式
 */
public class Main {
    public static void main(String[] args) {
        Engine engine2=new Engine2000();
        Engine engine3=new Engine3000();
        Car bus = new Bus(engine2);
        Car jeep=new Jeep(engine3);
        bus.installEngine();
        jeep.installEngine();
    }
}
