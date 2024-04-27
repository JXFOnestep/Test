package watcher;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jxf study
 * @date 2024/4/7 23:27
 */
public class BeijingWeather implements WeatherCenter {
    private List<Observer> list = new ArrayList<>();

    @Override
    public void publicWeatherInfo(String msg) {
        for(Observer o : list ) {
            o.sendWeatherWarning(msg);
        }
    }

    @Override
    public void addSubscribe(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeSubscribe(Observer observer) {
        list.remove(observer);
    }
}
