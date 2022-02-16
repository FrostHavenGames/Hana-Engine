package net.frosthaven.hana.events;

import java.util.function.Function;

public class EventDispatcher {
    private Event m_Event;

    public EventDispatcher(Event event) {
        this.m_Event = event;
    }

    public boolean dispatch(Event event) {
        if (m_Event.getEventType() == event.getEventType()) {
            // TODO: FIX
            m_Event.setHandled(true);
            return true;
        }

        return false;
    }
}
