package _22Memento;

/**
 * Created by Administrator on 上午 6:41.
 */
public class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {
    }

    public Person(int age, String gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Memento createMemento() {
        return new Memento(this.age, this.gender, this.name);

    }
    public void roolback(Memento memento){
        this.age=memento.getAge();
        this.gender=memento.getGender();
        this.name=memento.getName();
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
