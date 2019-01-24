package _7strategy;

/**
 * Created by Administrator on 下午 11:35.
 */
public class Strategy2 implements Strategy {
    @Override
    //满200减50
    public double sale(double price) {
        if(price>=200){
            return price-50;
        }
        return price;
    }
}
