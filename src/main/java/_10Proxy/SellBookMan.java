package _10Proxy;

/**
 * Created by Administrator on 下午 5:08.
 */
public class SellBookMan implements Sellbook {
    @Override
    public void sellBook() {
        System.out.println("我是书商，我只卖书");
    }
}
