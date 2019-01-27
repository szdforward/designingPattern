package _15mediator;

/**
 * Created by Administrator on 下午 10:14.
 * 中介者模式
 */
public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Person zhangsan = new Man(12, mediator, "zhangsan");
        Person lisi = new Man(11, mediator, "lisi");
        Person xiaojing = new Women(11, mediator, "xiaojing");
        Person wangxue = new Women(12, mediator, "wangxue");
        zhangsan.getPattern(lisi);//不好意思，我们没有女性会员了
        zhangsan.getPattern(xiaojing);//zhangsan和xiaojing不相配
        zhangsan.getPattern(wangxue);//zhangsan和wangxue相配
    }
}
