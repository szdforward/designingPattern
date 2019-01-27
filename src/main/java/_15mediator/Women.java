package _15mediator;

/**
 * Created by Administrator on 下午 10:00.
 */
public class Women extends Person {
    public Women(int age, Mediator mediator, String name) {
        super(age, mediator, name);
    }

    @Override
    public void getPattern(Person person) {
        this.getMediator().setWomen(this);
        this.getMediator().getPattern(person);
    }
}
