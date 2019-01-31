package _25Visitor;

/**
 * Created by Administrator on 上午 7:21.
 */
public class Main {
    public static void main(String[] args) {
        ParkA parkA = new ParkA();
        Visitor visitorA=new VisitorA();
        //两者都可以互相接收
        visitorA.visitor(parkA);
        parkA.accept(visitorA);
    }
}
