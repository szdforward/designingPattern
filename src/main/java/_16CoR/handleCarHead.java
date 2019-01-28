package _16CoR;

/**
 * Created by Administrator on 上午 6:58.
 */
public class handleCarHead extends HandleCar {
    @Override
    public void handleCar() {
        System.out.println("组装车头");
        if (this.handleCar != null) {
            this.handleCar.handleCar();
        }
    }
}
