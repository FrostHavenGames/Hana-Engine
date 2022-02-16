package net.frosthaven.hana.events.types;

import net.frosthaven.hana.events.Event;
import net.frosthaven.hana.events.EventCategory;
import net.frosthaven.hana.events.EventType;

public class WindowCloseEvent extends Event {

    public WindowCloseEvent() {
        m_EventType = EventType.WindowClose;
        m_EventCategory.add(EventCategory.Application);
    }
}
