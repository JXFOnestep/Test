package watcher.editor_notification;

import java.io.File;
import java.util.*;

/**
 * @author jxf study
 * @date 2024/4/21 22:18
 */
public class EventManager {
    Map<String, List<AbstractEventListener>> listeners = new HashMap<>();

    public EventManager(String ...operators) {
        for(String operator : operators) {
            listeners.put(operator, new ArrayList<>());
        }
    }

    public void unsubscribe(String eventType, AbstractEventListener listener) {
        if(!listeners.containsKey(eventType)) {
            //抛出异常 todo
            return;
        }
        List<AbstractEventListener> eventListeners = listeners.get(eventType);
        eventListeners.remove(listener);
    }

    public void subscribe(String eventType, AbstractEventListener listener){
        if(listeners.containsKey(eventType)) {
            List<AbstractEventListener> eventListeners = listeners.get(eventType);
            eventListeners.add(listener);
        }else {
            listeners.put(eventType, new ArrayList<>(List.of(listener)));
        }
    }

    public void notify(String eventType, File file) {
        List<AbstractEventListener> users = listeners.get(eventType);
        for (AbstractEventListener listener : users) {
            listener.update(eventType, file);
        }
    }
}
