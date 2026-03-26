package org.example;

import javax.swing.SwingUtilities;
import java.awt.*;
/**
 * Unit test for simple App.
 */

public class AppTest {
    public static void main(String[] args) {
        // Run the GUI creation on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            App frame = new App();
            frame.setVisible(true);
        });
    }
}
