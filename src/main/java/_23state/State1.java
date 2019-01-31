package _23state;

/**
 * Created by Administrator on 下午 8:57.
 */
public class State1 extends State {

    @Override
    public void doSomething(Person person) {
        if(person.getHour()=="7"){
            System.out.println("做第一件事情");
        }else{
            person.setState(new State2());
            person.doSomething();
        }
    }
}
