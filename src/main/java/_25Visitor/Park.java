package _25Visitor;

/**
 * Created by Administrator on 上午 7:17.
 */
public class Park implements ParkElement {
    private ParkA parkA;
    private ParkB parkB;

    public Park() {
        parkA=new ParkA();
        parkB=new ParkB();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
        parkA.accept(visitor);
        parkB.accept(visitor);
    }
}
