package net.frosthaven.hana.events.types;

import net.frosthaven.hana.events.EventType;

public class MouseButtonReleasedEvent extends MouseButtonEvent {

    public MouseButtonReleasedEvent(int button) {
        super(button);
        m_EventType = EventType.MouseButtonReleased;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MouseButtonReleasedEvent: ").append(m_Button);
        return sb.toString();
    }
}
