package _14Adapter;

/**
 * Created by Administrator on 下午 8:26.
 */
public class Adapter implements IAdapter {
    private Current220 current220;
    private Current230 current230;

    public Current230 getCurrent230() {
        return current230;
    }

    public void setCurrent230(Current230 current230) {
        this.current230 = current230;
    }

    public Current220 getCurrent220() {

        return current220;
    }

    public void setCurrent220(Current220 current220) {
        this.current220 = current220;
    }

    @Override
    public void computerJack() {
        System.out.println("使用转换器来转接电脑电源");
        current220.voltage();
        System.out.println("或者使用");
        current230.voltage();
    }
}
