package _6decorator;

/**
 * 装饰者模式-以一种对客户端透明的方式来扩展对象的功能
 * Created by Administrator on 下午 11:04.
 */
public class Main {
    public static void main(String[] args) {
        Coffee coffee=new OrdinaryCoffee();
        DecorateCoffee decorateCoffee=new MilkCoffee(coffee);
        decorateCoffee = new ChocolateCoffee(decorateCoffee);
        decorateCoffee = new SugarCoffee(decorateCoffee);
        System.out.println(decorateCoffee.getDesc());//一杯普通的咖啡+牛奶+巧克力+加糖


        //并且使用装饰者模式我们也可以按照自己的意愿进行不同方式的拼装，顺序的不同
        Coffee coffee1 = new OrdinaryCoffee();
        DecorateCoffee decorateCoffee1 = new MilkCoffee(coffee1);
        decorateCoffee1 = new SugarCoffee(decorateCoffee1);
        decorateCoffee1 = new ChocolateCoffee(decorateCoffee1);
        decorateCoffee1 = new SugarCoffee(decorateCoffee1);
        System.out.println(decorateCoffee1.getDesc());//一杯普通的咖啡+牛奶+加糖+巧克力+加糖

    }
}
