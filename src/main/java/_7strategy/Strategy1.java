package _7strategy;

/**
 * Created by Administrator on 下午 11:35.
 */
public class Strategy1 implements Strategy {
    @Override
    //打八折
    public double sale(double price) {
        return price*0.8;
    }
}
