package _16CoR;

/**
 * Created by Administrator on 下午 9:07.
 */
public class Main {
    public static void main(String[] args) {
        HandleCar handleCarHead = new handleCarHead();
        HandleCar handleCarBody = new HandleCarBody();
        HandleCar handleCarTail = new HandleCarTail();
        handleCarHead.setNextHandleCar(handleCarBody);
        handleCarBody.setNextHandleCar(handleCarTail);
        handleCarHead.handleCar();
        System.out.println("=================");
        //是有问题的，如果在设置的过程中我设置了null值的话会引起空指针异常
        handleCarHead.setNextHandleCar(handleCarBody).setNextHandleCar(handleCarTail);
        handleCarHead.handleCar();
        System.out.println("=============");
        handleCarBody.setNextHandleCar(handleCarHead).setNextHandleCar(handleCarTail);
        handleCarBody.handleCar();
    }
}
