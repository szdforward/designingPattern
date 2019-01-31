package _25Visitor;

/**
 * Created by Administrator on 上午 7:20.
 */
public class VisitorManager implements  Visitor {
    @Override
    public void visitor(Park park) {
        System.out.println("公园的管理者检查整个公园的卫生情况");
    }

    @Override
    public void visitor(ParkA parkA) {
        System.out.println("公园的管理者检查公园A区域的卫生情况");
    }

    @Override
    public void visitor(ParkB parkB) {
        System.out.println("公园的管理者检查公园B区域的卫生情况");
    }
}
