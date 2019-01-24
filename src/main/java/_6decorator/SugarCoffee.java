package _6decorator;

/**
 * Created by Administrator on 下午 11:02.
 */
public class SugarCoffee extends DecorateCoffee{
    private Coffee coffee;

    public SugarCoffee(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public String getDesc() {
        return coffee.getDesc()+"+加糖";
    }
}
