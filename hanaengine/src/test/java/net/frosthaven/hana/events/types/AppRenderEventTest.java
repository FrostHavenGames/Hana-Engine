package net.frosthaven.hana.events.types;

import net.frosthaven.hana.events.EventCategory;
import net.frosthaven.hana.events.EventType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppRenderEventTest {

    AppRenderEvent e;

    @BeforeEach
    void setUp() {
        e = new AppRenderEvent();
    }

    @AfterEach
    void tearDown() {
        e = null;
    }

    @DisplayName("Test EventCategory")
    @Test
    void testEventCategory() {
        assertTrue(e.isInCategory(EventCategory.Application));
    }

    @DisplayName("Test EventType")
    @Test
    void testEventType() {
        assertTrue(e.getEventType() == EventType.AppRender);
    }
}