package _14Adapter;

/**
 * Created by Administrator on 下午 8:10.
 * 适配器模式
 */
public class Main {
    public static void main(String[] args) {
        Adapter adapter=new Adapter();
        adapter.setCurrent220(new Current220());
        adapter.setCurrent230(new Current230());
        adapter.computerJack();
    }
}
