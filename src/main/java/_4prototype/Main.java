package _4prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 下午 10:08.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(12);
        person.setName("李华");
        List<String> friends = new ArrayList<String>();
        friends.add("张明");
        friends.add("王柏");
        person.setFriends(friends);
        Person clonePerson = person.clone();
        System.out.println(person.getName());
        System.out.println(clonePerson.getName());
        person.getFriends().add("白桦");
        System.out.println(person.getFriends());
        System.out.println(clonePerson.getFriends());
        //结果：
        //李华
        // 李华
        //[张明, 王柏, 白桦]
        //[张明, 王柏]
    }
}
