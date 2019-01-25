package _8observer;

/**
 * Created by Administrator on 下午 3:02.
 */
public class Article {
    public Article(String articleTitle, String articleContent) {
        this.articleContent = articleContent;
        this.articleTitle = articleTitle;
    }

    private String articleTitle;
    private String articleContent;

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }
}
