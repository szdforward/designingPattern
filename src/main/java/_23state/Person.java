package _23state;

/**
 * Created by Administrator on 下午 8:54.
 */
public class Person {
    private String hour;
    private State state=new State1();

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public void doSomething(){
        state.doSomething(this);
        state=new State1();
    }

}
