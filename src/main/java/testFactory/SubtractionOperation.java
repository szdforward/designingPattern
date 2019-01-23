package testFactory;

/**
 * Created by Administrator on 下午 8:42.
 */
public class SubtractionOperation extends Operation {
    @Override
    public double getResult() {
        return getNum1()-getNum2();
    }
}
