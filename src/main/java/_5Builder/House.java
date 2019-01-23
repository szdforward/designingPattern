package _5Builder;

/**
 * Created by Administrator on 下午 11:14.
 */
public class House {
    private String houseTop;
    private String wall;
    private String floor;

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getHouseTop() {
        return houseTop;
    }

    public void setHouseTop(String houseTop) {
        this.houseTop = houseTop;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    @Override
    public String toString() {
        return "House{" +
                "floor='" + floor + '\'' +
                ", houseTop='" + houseTop + '\'' +
                ", wall='" + wall + '\'' +
                '}';
    }
}
