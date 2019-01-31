package _23state;

/**
 * Created by Administrator on 下午 9:09.
 */
public class State3 extends State {

    @Override
    public void doSomething(Person person) {
        if (person.getHour() == "18") {
            System.out.println("做第三件事情");
        } else {
            person.setState(new OtherState());
            person.doSomething();
        }
    }
}
