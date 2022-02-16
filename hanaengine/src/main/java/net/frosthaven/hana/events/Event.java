package net.frosthaven.hana.events;

import java.util.EnumSet;

public abstract class Event {

    protected boolean m_Handled = false;
    protected EventType m_EventType;
    protected EnumSet<EventCategory> m_EventCategory = EnumSet.allOf(EventCategory.class);

    public void setHandled(boolean value) {
        m_Handled = value;
    }

    public EventType getEventType() {
        return m_EventType;
    }

    public boolean isInCategory(EventCategory category) {
        return m_EventCategory.contains(category);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
