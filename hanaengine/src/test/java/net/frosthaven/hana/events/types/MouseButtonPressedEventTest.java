package net.frosthaven.hana.events.types;

import net.frosthaven.hana.events.EventCategory;
import net.frosthaven.hana.events.EventType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MouseButtonPressedEventTest {

    MouseButtonPressedEvent e;

    @BeforeEach
    void setUp() {
        e = new MouseButtonPressedEvent(1);
    }

    @AfterEach
    void tearDown() {
        e = null;
    }

    @DisplayName("Test ToString()")
    @Test
    void testToString() {
        assertEquals("MouseButtonPressedEvent: 1", e.toString());
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
        assertTrue(e.getEventType() == EventType.MouseButtonPressed);
    }
}