package watcher.advance;

/**
 * @author jxf study
 * @date 2024/4/7 23:42
 */
public class CloseDoorListener implements DoorListener{
    @Override
    public void doorEvent(DoorEvent doorEvent) {
        Integer status = doorEvent.getStatus();
        if(status == 0) {
            System.out.println("the door is close");
        }
    }
}
