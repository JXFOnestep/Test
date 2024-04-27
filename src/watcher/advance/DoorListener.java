package watcher.advance;

import java.util.EventListener;

/**
 * @author jxf study
 * @date 2024/4/7 23:41
 */
public interface DoorListener extends EventListener {
    void doorEvent(DoorEvent doorEvent);
}
