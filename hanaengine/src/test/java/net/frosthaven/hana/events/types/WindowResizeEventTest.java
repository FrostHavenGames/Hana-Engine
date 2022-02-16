package net.frosthaven.hana.events.types;

import net.frosthaven.hana.events.EventCategory;
import net.frosthaven.hana.events.EventType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WindowResizeEventTest {

    WindowResizeEvent e;

    @BeforeEach
    void setUp() {
        e = new WindowResizeEvent(960, 540);
    }

    @AfterEach
    void tearDown() {
        e = null;
    }

    @DisplayName("Test GetWidth()")
    @Test
    void getWidth() {
        assertEquals(960, e.getWidth());
    }

    @DisplayName("Test GetHeight()")
    @Test
    void getHeight() {
        assertEquals(540, e.getHeight());
    }

    @DisplayName("Test ToString()")
    @Test
    void testToString() {
        assertEquals("WindowResizeEvent: 960, 540", e.toString());
    }

    @DisplayName("Test EventCategory")
    @Test
    void testEventCategory() {
        assertTrue(e.isInCategory(EventCategory.Application));
    }

    @DisplayName("Test EventType")
    @Test
    void testEventType() {
        assertTrue(e.getEventType() == EventType.WindowResize);
    }
}