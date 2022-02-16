package net.frosthaven.hana.events.types;

import net.frosthaven.hana.events.Event;
import net.frosthaven.hana.events.EventCategory;
import net.frosthaven.hana.events.EventType;

public class AppTickEvent extends Event {

    public AppTickEvent() {
        m_EventType = EventType.AppTick;
        m_EventCategory.add(EventCategory.Application);
    }
}
