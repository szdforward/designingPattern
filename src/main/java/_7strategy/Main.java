package _7strategy;

/**
 * 策略模式
 * Created by Administrator on 下午 11:37.
 */
public class Main {
    public static void main(String[] args) {
        double price=300;
        //客户端需要知道各种策略的具体的目标
        Context context = new Context(new Strategy1());
        System.out.println(context.sale(price));
    }
}
