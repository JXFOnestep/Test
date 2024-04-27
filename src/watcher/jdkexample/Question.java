package watcher.jdkexample;

/**
 * @author jxf study
 * @date 2024/4/18 00:33
 */
public class Question {
    String content;
    Integer id;
    String whoAsked;

    public Question(String content, Integer id, String whoAsked) {
        this.content = content;
        this.id = id;
        this.whoAsked = whoAsked;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWhoAsked() {
        return whoAsked;
    }

    public void setWhoAsked(String whoAsked) {
        this.whoAsked = whoAsked;
    }
}
