package net.frosthaven.hana.events.types;

import net.frosthaven.hana.events.Event;
import net.frosthaven.hana.events.EventCategory;
import net.frosthaven.hana.events.EventType;

public class MouseMovedEvent extends Event {

    private float m_MouseX, m_MouseY;

    public final float getX() {
        return m_MouseX;
    }

    public final float getY() {
        return m_MouseY;
    }

    public MouseMovedEvent(float x, float y) {
        this.m_MouseX = x;
        this.m_MouseY = y;

        m_EventType = EventType.MouseMoved;
        m_EventCategory.add(EventCategory.Mouse);
        m_EventCategory.add(EventCategory.Input);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MouseMovedEvent: ").append(m_MouseX).append(", ").append(m_MouseY);
        return sb.toString();
    }
}
