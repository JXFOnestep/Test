package watcher;

/**
 * @author jxf study
 * @date 2024/4/7 23:27
 */
public class CCTVWatcher implements Observer{
    @Override
    public void sendWeatherWarning(String msg) {
        System.out.println("中央电视台天气预报" + msg);
    }
}
