package _5Builder;

/**
 * Created by Administrator on 下午 11:23.
 * 后期如果还需要其他的房子的话，可以在创建新的工程队就可以了
 */
public class Main {
    public static void main(String[] args) {
        //要建造平房的话首先找一个平房工程队
        HouseBuilder hb=new PingFangBuilder();
        //找一个平房设计师
        Director director=new Director(hb);
        //设计师指导造房子
        director.makeHouse();
        //工程队造好了房子
        House house = hb.getHouse();
        System.out.println(house);

        //建造公寓找公寓工程队
        HouseBuilder hb1=new GongYuBuilder();
        Director director1 = new Director(hb1);
        director1.makeHouse();
        House house1 = hb1.getHouse();
        System.out.println(house1);
    }
}
