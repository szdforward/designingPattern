package _25Visitor;

/**
 * Created by Administrator on 上午 7:12.
 */
public interface Visitor {
    public void visitor(Park park);

    public void visitor(ParkA parkA);

    public void visitor(ParkB parkB);
}
