package _5Builder;

/**
 * Created by Administrator on 下午 11:21.
 * 指挥者或者设计师
 */
public class Director {
    private HouseBuilder houseBuilder;
    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder=houseBuilder;
    }
    //指挥工程队造房子
    public void makeHouse(){
        houseBuilder.makeHouseTop();
        houseBuilder.makeWall();
        houseBuilder.makeFloor();
    }
}
