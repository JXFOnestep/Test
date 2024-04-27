package watcher;

/**
 * @author jxf study
 * @date 2024/4/7 23:23
 * 观察者模式一般包含以下几个对象：
 * Subject：被观察的对象。它提供一系列方法来增加和删除观察者对象，同时它定义了通知方法notify()。
 *      目标类可以是接口，也可以是抽象类或具体类。
 * ConcreteSubject：具体的观察对象。Subject的具体实现类，在这里实现通知事件。
 * Observer：观察者。这里是抽象的观察者，观察者有一个或者多个。
 * ConcreteObserver：具体的观察者。在这里维护观察对象的具体操作。
 *
 * 这里定义一个气象中心，观察者是各个电视台，气象中心是被观察者，电视台订阅气象中心的气象数据
 */
public interface WeatherCenter {
    void publicWeatherInfo(String msg);
    void addSubscribe(Observer observer);
    void removeSubscribe(Observer observer);
}
