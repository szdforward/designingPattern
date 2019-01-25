package _9flyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 下午 4:09.
 */
public class FlyWeightPerson {
    private static Map<String,Person> pool;

    static{
        pool=new HashMap<String,Person>();
    }

    public static Person getPereson(String idNumber){
        Person person = pool.get(idNumber);
        //感觉这里可以根据具体的类型，使用策略模式得到相应的执行策略，在此做的简单化了
        if(person==null){
            person=new Teacher(idNumber);
            pool.put(idNumber,person);
        }
        return person;

    }

}
