package watcher.advance;

/**
 * @author jxf study
 * @date 2024/4/7 23:42
 */
public class OpenDoorListener implements DoorListener{
    @Override
    public void doorEvent(DoorEvent doorEvent) {
        Integer status = doorEvent.getStatus();
        if(status == 1) {
            System.out.println("door is open");
        }
    }
}
