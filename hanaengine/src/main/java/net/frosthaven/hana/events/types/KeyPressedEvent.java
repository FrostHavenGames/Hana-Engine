package net.frosthaven.hana.events.types;

import net.frosthaven.hana.events.EventType;

public class KeyPressedEvent extends KeyEvent {

    private int m_RepeatCount;

    public int getRepeatCount() {
        return m_RepeatCount;
    }

    public KeyPressedEvent(int keycode, int repeatCount) {
        super(keycode);
        this.m_RepeatCount = repeatCount;
        m_EventType = EventType.KeyPressed;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPressedEvent: ").append(m_KeyCode).append(" (").append(m_RepeatCount).append(" repeats)");
        return sb.toString();
    }
}
