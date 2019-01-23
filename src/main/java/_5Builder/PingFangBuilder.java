package _5Builder;

/**
 * Created by Administrator on 下午 11:17.
 * 建造平房的工程队
 */
public class PingFangBuilder implements HouseBuilder {

    House house=new House();

    @Override
    public void makeHouseTop() {
        house.setHouseTop("平房=>屋顶");
    }

    @Override
    public void makeWall() {
        house.setWall("平房=>墙壁");
    }

    @Override
    public void makeFloor() {
        house.setFloor("平房=>地板");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
