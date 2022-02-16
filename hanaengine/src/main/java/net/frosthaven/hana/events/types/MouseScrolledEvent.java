package net.frosthaven.hana.events.types;

import net.frosthaven.hana.events.Event;
import net.frosthaven.hana.events.EventCategory;
import net.frosthaven.hana.events.EventType;

public class MouseScrolledEvent extends Event {

    private float m_XOffset, m_YOffset;

    public final float getXOffset() {
        return m_XOffset;
    }

    public final float getYOffset() {
        return m_YOffset;
    }

    public MouseScrolledEvent(float xOffset, float yOffset) {
        this.m_XOffset = xOffset;
        this.m_YOffset = yOffset;
        m_EventType = EventType.MouseScrolled;
        m_EventCategory.add(EventCategory.Mouse);
        m_EventCategory.add(EventCategory.Input);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MouseScrolledEvent: ").append(m_XOffset).append(", ").append(m_YOffset);
        return sb.toString();
    }
}
