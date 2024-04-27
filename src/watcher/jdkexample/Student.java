package watcher.jdkexample;

import java.util.Observable;

/**
 * @author jxf study
 * @date 2024/4/18 00:30
 * 目标，被观察者对象，继承JDK提供的Observable
 */
public class Student extends Observable {
    private String studentName;

    public void pushQuestion(Question question){
        System.out.println("学生【" + this.studentName + "】在系统中推送了一个问题，请您及时查看~");
        //设置主题对象内部状态发生变动
        setChanged();
        //通知观察者 (老师)
        notifyObservers(question);
    }
}
