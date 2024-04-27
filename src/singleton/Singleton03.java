package singleton;

/**
 * @author jxf study
 * @date 2024/4/7 23:16
 * 懒汉式 双重校验锁
 */
public class Singleton03 {
    private static Singleton03 instance = null;

    private Singleton03() {
    }

    public static Singleton03 getInstance() {
        if (instance == null) {
            synchronized (Singleton03.class) {
                if (instance == null) {
                    instance = new Singleton03();
                }
            }
        }
        return instance;
    }
}
