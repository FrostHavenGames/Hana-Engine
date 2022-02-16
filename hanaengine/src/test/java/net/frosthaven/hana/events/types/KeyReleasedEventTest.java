package net.frosthaven.hana.events.types;

import net.frosthaven.hana.events.EventCategory;
import net.frosthaven.hana.events.EventType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeyReleasedEventTest {

    KeyReleasedEvent e;

    @BeforeEach
    void setUp() {
        e = new KeyReleasedEvent(2);
    }

    @AfterEach
    void tearDown() {
        e = null;
    }

    @Test
    void testToString() {
        assertEquals("KeyReleasedEvent: 2", e.toString());
    }

    @DisplayName("Test EventCategory")
    @Test
    void testEventCategory() {
        assertTrue(e.isInCategory(EventCategory.Application));
        assertTrue(e.isInCategory(EventCategory.Input));
    }

    @DisplayName("Test EventType")
    @Test
    void testEventType() {
        assertTrue(e.getEventType() == EventType.KeyReleased);
    }
}