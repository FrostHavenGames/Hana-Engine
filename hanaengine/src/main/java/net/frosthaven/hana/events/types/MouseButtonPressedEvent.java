package net.frosthaven.hana.events.types;

import net.frosthaven.hana.events.EventType;

public class MouseButtonPressedEvent extends MouseButtonEvent {

    public MouseButtonPressedEvent(int button) {
        super(button);
        m_EventType = EventType.MouseButtonPressed;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MouseButtonPressedEvent: ").append(m_Button);
        return sb.toString();
    }
}
