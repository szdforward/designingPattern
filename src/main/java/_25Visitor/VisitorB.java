package _25Visitor;

/**
 * Created by Administrator on 上午 7:18.
 */
public class VisitorB implements Visitor {
    @Override
    public void visitor(Park park) {

    }

    @Override
    public void visitor(ParkA parkA) {

    }

    @Override
    public void visitor(ParkB parkB) {
        System.out.println("清洁工B打扫公园B区域卫生");
    }
}
