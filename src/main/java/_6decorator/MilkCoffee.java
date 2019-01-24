package _6decorator;

/**
 * Created by Administrator on 下午 11:04.
 */
public class MilkCoffee extends DecorateCoffee {
    private Coffee coffee;

    public MilkCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDesc() {
        return coffee.getDesc()+"+牛奶";
    }
}
