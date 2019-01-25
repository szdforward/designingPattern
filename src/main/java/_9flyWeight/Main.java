package _9flyWeight;

/**
 * Created by Administrator on 下午 4:08.
 * 享元模式
 */
public class Main {
    public static void main(String[] args) {
        Teacher teacher = (Teacher)FlyWeightPerson.getPereson("001");
        Teacher teacher1 = (Teacher)FlyWeightPerson.getPereson("001");
        Teacher teacher2 = (Teacher)FlyWeightPerson.getPereson("002");
        System.out.println(teacher.getIdNumber());
        System.out.println(teacher1.getIdNumber());
        System.out.println(teacher2.getIdNumber());
        System.out.println(teacher1==teacher);//true

    }
}
