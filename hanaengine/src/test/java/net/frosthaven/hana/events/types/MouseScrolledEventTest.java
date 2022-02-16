package net.frosthaven.hana.events.types;

import net.frosthaven.hana.events.EventCategory;
import net.frosthaven.hana.events.EventType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MouseScrolledEventTest {

    MouseScrolledEvent e;

    @BeforeEach
    void setUp() {
        e  = new MouseScrolledEvent(-10, 10);
    }

    @AfterEach
    void tearDown() {
        e = null;
    }

    @DisplayName("Test GetXOffset()")
    @Test
    void getXOffset() {
        assertEquals(-10, e.getXOffset());
    }

    @DisplayName("Test GetYOffset()")
    @Test
    void getYOffset() {
        assertEquals(10, e.getYOffset());
    }

    @DisplayName("Test ToString()")
    @Test
    void testToString() {
        assertEquals("MouseScrolledEvent: -10.0, 10.0", e.toString());
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
        assertTrue(e.getEventType() == EventType.MouseScrolled);
    }
}