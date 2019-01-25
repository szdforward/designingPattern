package _9flyWeight;

/**
 * Created by Administrator on 下午 4:06.
 * 作为享元模式的共享的对象
 */
public class Teacher extends Person {
    private String idNumber;

    public Teacher(String idNumber) {
        this.idNumber = idNumber;
    }

    public Teacher(int age, String name, int sex, String idNumber) {
        super(age, name, sex);
        this.idNumber = idNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}
