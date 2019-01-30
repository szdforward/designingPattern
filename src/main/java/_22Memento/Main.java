package _22Memento;

/**
 * Created by Administrator on 上午 6:40.
 * 备忘录模式-在修改之前创建备忘录，修改后如果想恢复数据的话可以通过备忘录进行恢复
 */
public class Main {
    public static void main(String[] args) {
        Person person=new Person(12,"nan","桑佳佳");
        Caretaker caretaker=new Caretaker();
        caretaker.setMemento(person.createMemento());
        System.out.println(person);
        person.setAge(34);
        System.out.println(person);
        person.roolback(caretaker.getMemento());
        System.out.println(person);

    }
}
