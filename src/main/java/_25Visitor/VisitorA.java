package _25Visitor;

/**
 * Created by Administrator on 上午 7:18.
 */
public class VisitorA implements Visitor {
    @Override
    public void visitor(Park park) {

    }

    @Override
    public void visitor(ParkA parkA) {
        System.out.println("清洁工A打扫公园A区域卫生");
    }

    @Override
    public void visitor(ParkB parkB) {

    }

}
