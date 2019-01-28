package _16CoR;

/**
 * Created by Administrator on 下午 10:11.
 */
public abstract class HandleCar {
    protected HandleCar handleCar;
    public HandleCar setNextHandleCar(HandleCar handleCar){
        if(handleCar!=null){
            this.handleCar=handleCar;
        }
        return handleCar;
    }
    public abstract void handleCar();

}
