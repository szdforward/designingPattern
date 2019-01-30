package _21TemplateMethod;

/**
 * Created by Administrator on 上午 6:32.
 * 模板方法模式-把某些必要的处理委让给抽象方法
 */
public class Main {
    public static void main(String[] args) {
        AssembleCar assembleBusCar=new AssembleBusCar();
        assembleBusCar.assembleAll();
        AssembleCar assembleJeepCar=new AssembleJeepCar();
        assembleJeepCar.assembleAll();
    }
}
