package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import javax.swing.SwingUtilities;

public class AppTest {

    @Test
    public void testAppInitialization() {
        // This test checks if the App can be initialized without crashing
        App frame = new App();

        // Assert that the frame was created successfully
        assertNotNull("The App frame should not be null", frame);

        // Basic check for your JFrame properties
        assertEquals("Java GUI Example", frame.getTitle());
    }
}