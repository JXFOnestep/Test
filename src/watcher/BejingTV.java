package watcher;

/**
 * @author jxf study
 * @date 2024/4/7 23:26
 * 具体的观察者
 */
public class BejingTV implements Observer{
    @Override
    public void sendWeatherWarning(String msg) {
        System.out.println("北京卫视天气预报" + msg);
    }
}
