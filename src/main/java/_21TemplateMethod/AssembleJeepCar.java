package _21TemplateMethod;

/**
 * Created by Administrator on 上午 6:31.
 */
public class AssembleJeepCar extends AssembleCar {
    @Override
    public void assembleHead() {
        System.out.println("组装吉普车的车头");
    }

    @Override
    public void assembleBody() {
        System.out.println("组装吉普车的车身");
    }

    @Override
    public void assembleTail() {
        System.out.println("组装吉普车的车尾");
    }
}
