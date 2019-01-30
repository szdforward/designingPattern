package _22Memento;

/**
 * Created by Administrator on 上午 6:42.
 */
public class Memento {
    private String name;
    private int age;
    private String gender;

    public Memento(int age, String gender, String name) {
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
}
