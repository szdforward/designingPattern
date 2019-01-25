package _8observer;

import java.util.Observable;

/**
 * Created by Administrator on 下午 2:57.
 * 被观察者  实现Observable类
 */
public class BlogUser extends Observable {
    //发表了博客
    public void publicBlog(){
        System.out.println("博士发博客");
        this.setChanged();
        Article article = new Article("如何成为大牛？", "天天学习，不断进步，对未知的知识充满渴求，量变引起质变！");
        this.notifyObservers(article);
    }
}
