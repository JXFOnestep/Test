package watcher.jdkexample;

/**
 * @author jxf study
 * @date 2024/4/18 00:36
 */
public class MainTest {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();
        Student student = new Student();
        student.addObserver(teacher1);
        student.addObserver(teacher2);

        student.pushQuestion(new Question("什么是观察者模式",1,"student"));

    }
}
