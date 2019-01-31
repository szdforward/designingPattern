package _25Visitor;

/**
 * Created by Administrator on 上午 7:15.
 */
public class ParkB implements ParkElement {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }
}
