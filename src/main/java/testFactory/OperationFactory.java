package testFactory;

/**
 * Created by Administrator on 下午 8:34.
 */
public class OperationFactory {
    public static Operation getOperation(String operator) {
        if ("+".equals(operator)) {
            return new AddOperation();
        } else if ("-".equals(operator)) {
            return new SubtractionOperation();
        } else {
            return null;
        }
    }
}