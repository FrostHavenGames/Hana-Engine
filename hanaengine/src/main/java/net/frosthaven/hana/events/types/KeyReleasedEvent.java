package net.frosthaven.hana.events.types;

import net.frosthaven.hana.events.EventType;

public class KeyReleasedEvent extends KeyEvent {

    public KeyReleasedEvent(int keycode) {
        super(keycode);
        m_EventType = EventType.KeyReleased;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyReleasedEvent: ").append(m_KeyCode);
        return sb.toString();
    }
}
