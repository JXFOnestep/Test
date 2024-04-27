package watcher.editor_notification;

import java.io.File;

/**
 * @author jxf study
 * @date 2024/4/21 22:28
 */
public interface AbstractEventListener {
    void update(String eventType, File file);
}