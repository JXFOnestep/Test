package watcher.editor_notification;

import java.io.File;

/**
 * @author jxf study
 * @date 2024/4/21 22:31
 */
public class LogOpenListener implements AbstractEventListener{
    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
