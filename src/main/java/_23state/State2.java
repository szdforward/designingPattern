package _23state;

/**
 * Created by Administrator on 下午 9:08.
 */
public class State2 extends State {

    @Override
    public void doSomething(Person person) {
        if (person.getHour() == "12") {
            System.out.println("做第二件事情");
        } else {
            person.setState(new State3());
            person.doSomething();
        }
    }
}
