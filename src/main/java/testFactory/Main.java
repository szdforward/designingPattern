package testFactory;

/**
 * Created by Administrator on 下午 8:30.
 */
public class Main {
    public static void main(String[] args) {
        //使用简单工厂模式或者工厂方法模式写一个简单计算器
        //使用面向对象编程
        //下面使用简单工厂模式进行编写（工厂方法的模式的话就是把OperationFactory作为一个接口，针对不同的操作写OperationFactory的具体的工厂实现类
        // 这样有一个缺点就是我需要事先根据你的操作符来确定选择哪个具体的工厂实现类，如果后续需要添加新的操作（比如求余）的话，还需要修改这个main方法）
        Operation operation = OperationFactory.getOperation("+");
        if(operation!=null){
            operation.setNum1(1);
            operation.setNum2(2);
            double result = operation.getResult();
            System.out.println(result);
        }else{
            System.out.println("没有对应的操作符");
        }
    }
}
