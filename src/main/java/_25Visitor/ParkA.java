package _25Visitor;

/**
 * Created by Administrator on 上午 7:14.
 */
public class ParkA implements ParkElement {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }
}
