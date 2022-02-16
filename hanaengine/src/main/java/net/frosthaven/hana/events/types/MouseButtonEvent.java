package net.frosthaven.hana.events.types;

import net.frosthaven.hana.events.Event;
import net.frosthaven.hana.events.EventCategory;

public class MouseButtonEvent extends Event {
    protected int m_Button;
    public int getMouseButton() {
        return m_Button;
    }

    protected MouseButtonEvent (int button) {
        this.m_Button = button;
        m_EventCategory.add(EventCategory.MouseButton);
        m_EventCategory.add(EventCategory.Input);
    }
}
