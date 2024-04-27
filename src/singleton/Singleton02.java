package singleton;

/**
 * @author jxf study
 * @date 2024/4/7 23:13
 * 懒汉式，在获取实例时才进行实例化
 * 缺点：线程不安全
 * 如果要线程安全，那么加synchronized，但是这样效率会变低
 */
public class Singleton02 {
    private static Singleton02 instance = null;

    private Singleton02() {
    }

    public static Singleton02 getInstance() {
        if(instance == null) {
            instance = new Singleton02();
        }
        return instance;
    }
}
