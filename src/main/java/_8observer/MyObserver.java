package _8observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 下午 3:00.
 */
public class MyObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("你关注的博主发博客了~");
        Article article = (Article) arg;
        System.out.println("博客标题为："+article.getArticleTitle());
        System.out.println("博客部分内容为："+article.getArticleContent());
    }
}
