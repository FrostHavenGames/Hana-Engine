package net.frosthaven.hana.events.types;

import net.frosthaven.hana.events.EventCategory;
import net.frosthaven.hana.events.EventType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MouseMovedEventTest {

    MouseMovedEvent e;

    @BeforeEach
    void setUp() {
        e = new MouseMovedEvent(5, 4);
    }

    @AfterEach
    void tearDown() {
        e = null;
    }

    @DisplayName("Test GetX()")
    @Test
    void getX() {
        assertEquals(5, e.getX());
    }

    @DisplayName("Test GetY()")
    @Test
    void getY() {
        assertEquals(4, e.getY());
    }

    @DisplayName("Test ToString()")
    @Test
    void testToString() {
        assertEquals("MouseMovedEvent: 5.0, 4.0", e.toString());
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
        assertTrue(e.getEventType() == EventType.MouseMoved);
    }
}