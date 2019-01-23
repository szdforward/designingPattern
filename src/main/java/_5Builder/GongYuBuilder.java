package _5Builder;

/**
 * Created by Administrator on 下午 11:26.
 */
public class GongYuBuilder implements HouseBuilder {
    House house=new House();
    @Override
    public void makeHouseTop() {
        house.setHouseTop("公寓=>屋顶");
    }

    @Override
    public void makeWall() {
        house.setWall("公寓=>墙壁");
    }

    @Override
    public void makeFloor() {
        house.setFloor("公寓=>地板");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
