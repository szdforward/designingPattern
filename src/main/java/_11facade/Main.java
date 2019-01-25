package _11facade;

/**
 * Created by Administrator on 下午 8:31.
 * 外观模式：为一组具有类似功能的类群，提供一个一致的简单的界面
 */
public class Main {
    public static void main(String[] args) {
        JiJin jiJin = new JiJin();
        jiJin.jiJin1();
        System.out.println("============");
        jiJin.jiJin2();
    }
}
