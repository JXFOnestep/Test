package singleton;

/**
 * @author jxf study
 * @date 2024/4/7 23:11
 * 饿汉式
 * 优点：简单，在类加载的时候就完成了实例化，避免了线程同步问题
 * 缺点：造成内存浪费
 */
public class Singleton01 {
    private static final Singleton01 instance = new Singleton01();
    private Singleton01(){}
    public static Singleton01 getInstance() {
        return instance;
    }
}
