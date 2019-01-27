package _15mediator;

/**
 * Created by Administrator on 下午 9:59.
 */
public class Man extends Person {

    public Man(int age, Mediator mediator, String name) {
        super(age, mediator, name);
    }

    @Override
    public void getPattern(Person person) {
        this.getMediator().setMan(this);
        this.getMediator().getPattern(person);
    }
}
