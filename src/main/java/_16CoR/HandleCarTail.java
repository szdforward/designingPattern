package _16CoR;

/**
 * Created by Administrator on 上午 6:59.
 */
public class HandleCarTail extends HandleCar {
    @Override
    public void handleCar() {
        System.out.println("组装车尾");
        if(this.handleCar!=null){
            this.handleCar.handleCar();
        }
    }
}
