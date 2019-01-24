package _7strategy;

/**
 * Created by Administrator on 下午 11:36.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public double sale(double price) {
       return  strategy.sale(price);
    }
}
