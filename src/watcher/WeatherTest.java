package watcher;

/**
 * @author jxf study
 * @date 2024/4/18 00:22
 */
public class WeatherTest {
    public static void main(String[] args) {
        WeatherCenter weatherCenter = new BeijingWeather();
        Observer observer1 = new BejingTV();
        Observer observer2 = new CCTVWatcher();
        weatherCenter.addSubscribe(observer1);
        weatherCenter.addSubscribe(observer2);

        //发送消息
        weatherCenter.publicWeatherInfo("Helloworld");

        weatherCenter.removeSubscribe(observer1);
        System.out.println("=========");
        weatherCenter.publicWeatherInfo("雪天");
    }
}
