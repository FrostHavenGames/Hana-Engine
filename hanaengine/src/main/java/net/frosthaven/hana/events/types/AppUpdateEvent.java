package net.frosthaven.hana.events.types;

import net.frosthaven.hana.events.Event;
import net.frosthaven.hana.events.EventCategory;
import net.frosthaven.hana.events.EventType;

public class AppUpdateEvent extends Event {

    public AppUpdateEvent() {
        m_EventType = EventType.AppUpdate;
        m_EventCategory.add(EventCategory.Application);
    }
}
