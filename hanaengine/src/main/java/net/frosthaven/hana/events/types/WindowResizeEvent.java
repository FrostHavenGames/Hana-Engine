package net.frosthaven.hana.events.types;

import net.frosthaven.hana.events.Event;
import net.frosthaven.hana.events.EventCategory;
import net.frosthaven.hana.events.EventType;

public class WindowResizeEvent extends Event {
    private int m_Width;
    private int m_Height;

    public int getWidth() {
        return m_Width;
    }

    public int getHeight() {
        return m_Height;
    }

    public WindowResizeEvent(int width, int height) {
        this.m_Width = width;
        this.m_Height = height;
        m_EventType = EventType.WindowResize;
        m_EventCategory.add(EventCategory.Application);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WindowResizeEvent: ").append(m_Width).append(", ").append(m_Height);
        return sb.toString();
    }
}
