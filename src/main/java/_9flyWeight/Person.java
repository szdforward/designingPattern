package _9flyWeight;

/**
 * Created by Administrator on 下午 4:04.
 */
public abstract class Person {
    private String name;
    private int age;
    private int sex;

    public Person() {
    }

    public Person(int age, String name, int sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
