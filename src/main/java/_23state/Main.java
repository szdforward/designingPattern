package _23state;

/**
 * Created by Administrator on 下午 8:53.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setHour("7");
        person.doSomething();
        person.setHour("12");
        person.doSomething();
        person.doSomething();
        person.setHour("18");
        person.doSomething();
        person.setHour("7");
        person.doSomething();
        person.setHour("72");
        person.doSomething();
        //做第一件事情
        //        做第二件事情
        //做第二件事情
        //        做第三件事情
        //做第一件事情
        //无事可做！
    }
}
