package watcher.advance;

import java.util.EventObject;

/**
 * @author jxf study
 * @date 2024/4/7 23:39
 * Java中提供了基本的事件处理基类：
 *  1. EventObject：所有事件状态对象都将从其派生的根类；
 *  2. AbstractEventListener：所有事件侦听器接口必须扩展的标记接口；
 */
public class DoorEvent extends EventObject {

    private Integer doorStatus;

    public DoorEvent(Object source) {
        super(source);
    }

    public DoorEvent(Object source, Integer status) {
        super(source);
        this.doorStatus = status;
    }

    public void setStatus(Integer status) {
        this.doorStatus = status;
    }

    public Integer getStatus() {
        return doorStatus;
    }
}
