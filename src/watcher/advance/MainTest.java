package watcher.advance;

import org.w3c.dom.ranges.DocumentRange;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jxf study
 * @date 2024/4/7 23:44
 */
public class MainTest {
    public static List<DoorListener> getAllListeners() {
        List<DoorListener> list = new ArrayList<>();
        list.add(new OpenDoorListener());
        list.add(new CloseDoorListener());
        return list;
    }
    public static void main(String[] args) {
        DoorEvent doorEvent = new DoorEvent("open", 1);
        List<DoorListener> allListeners = getAllListeners();
        for(DoorListener listener : allListeners) {
            listener.doorEvent(doorEvent);
        }
    }
}
