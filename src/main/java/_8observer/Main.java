package _8observer;

import _9flyWeight.BlogUser;

/**
 * Created by Administrator on 下午 3:01.
 */
public class Main {
    public static void main(String[] args) {
        BlogUser blogUser = new BlogUser();
        blogUser.addObserver(new MyObserver());
        blogUser.publicBlog();
    }
}
