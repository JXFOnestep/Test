package watcher.editor_notification;


import java.io.File;

/**
 * @author jxf study
 * @date 2024/4/21 22:29
 */
public class EmailNotificationListener implements AbstractEventListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
