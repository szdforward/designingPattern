package _4prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式的原型类，需要实现clonable接口
 */
public class Person implements Cloneable {
    private String name;
    private int age;
    private List<String> friends;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //克隆方法的实现（如果仅仅是super.clone()的话为浅度克隆，对于引用类型的成员变量无法复制另外一份），下面为深度克隆
    public Person clone(){
        try {
            Person clonePerson = (Person) super.clone();
            //单独的在堆里面创建一个引用实例
            List<String> friends=new ArrayList<String>();
            //注意这里容易出现问题！需要使用this.friends或者this.getFriends  如果你使用friends的话是有问题的，因为你上面的局部变量也是friends
            for(String friend:this.friends){
                friends.add(friend);
            }
            clonePerson.setFriends(friends);
            return clonePerson;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

}
