package testFactory;

/**
 * Created by Administrator on 下午 8:32.
 */
public class AddOperation extends Operation {

    @Override
    public double getResult() {
        return getNum1()+getNum2();
    }
}
