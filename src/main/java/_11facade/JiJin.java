package _11facade;

/**
 * Created by Administrator on 下午 8:27.
 */
public class JiJin {
    private GuoZhai guoZhai;
    private QiHuo qiHuo;
    private GuPiao guPiao;

    public JiJin() {
        this.guoZhai=new GuoZhai();
        this.guPiao=new GuPiao();
        this.qiHuo=new QiHuo();
    }

    public void jiJin1(){
        guoZhai.buy();
        guPiao.buy();
        qiHuo.buy();
    }

    public void jiJin2(){
        guPiao.buy();
        qiHuo.buy();
    }

    public void jiJin3(){
        qiHuo.buy();
        guoZhai.buy();
    }


}
