package watcher.jdkexample;


import java.util.Observable;
import java.util.Observer;

/**
 * @author jxf study
 * @date 2024/4/18 00:35
 */
public class Teacher implements Observer {

    private String teacherName;

    /**
     * @param o 具体的被观察对象
     * @param arg 通知参数
     */
    @Override
    public void update(Observable o, Object arg) {
        Student student = (Student) o;
        Question question = (Question) arg;
        System.out.println(this.teacherName + " 您好~ 您收到来自学生【" + question.getWhoAsked()+ "】的提问! 问题是：" + question.getContent() + " 请您及时解答~");
    }
}
