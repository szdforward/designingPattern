package _15mediator;

/**
 * Created by Administrator on 下午 9:57.
 */
public abstract class Person {
    private String name;
    private int age;
    private Mediator mediator;

    public Person(int age, Mediator mediator, String name) {
        this.age = age;
        this.mediator = mediator;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void getPattern(Person person);
}
