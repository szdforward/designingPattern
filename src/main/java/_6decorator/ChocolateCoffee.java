package _6decorator;

/**
 * Created by Administrator on 下午 11:03.
 */
public class ChocolateCoffee extends DecorateCoffee {
    private Coffee coffee;

    public ChocolateCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDesc() {
        return coffee.getDesc()+"+巧克力";
    }
}
