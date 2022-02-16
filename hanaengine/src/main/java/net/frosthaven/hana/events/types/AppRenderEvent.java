package net.frosthaven.hana.events.types;

import net.frosthaven.hana.events.Event;
import net.frosthaven.hana.events.EventCategory;
import net.frosthaven.hana.events.EventType;

public class AppRenderEvent extends Event {

    public AppRenderEvent() {
        m_EventType = EventType.AppRender;
        m_EventCategory.add(EventCategory.Application);
    }
}
