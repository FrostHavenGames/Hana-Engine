package net.frosthaven.hana.events.types;

import net.frosthaven.hana.events.Event;
import net.frosthaven.hana.events.EventCategory;

public class KeyEvent extends Event {

    protected int m_KeyCode;
    private int getKeyCode() { return m_KeyCode;}

    protected KeyEvent(int keycode) {
        this.m_KeyCode = keycode;
        m_EventCategory.add(EventCategory.Keyboard);
        m_EventCategory.add(EventCategory.Input);
    }
}
