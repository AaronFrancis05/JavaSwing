package org.example;

/**
 * Hello world!
 *
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class App extends JFrame {

    public App() {
        // Set up basic window properties
        setTitle("Java GUI Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centers the window
        setLayout(new FlowLayout());

        // Add some components
        JLabel label = new JLabel("Welcome to the App!");
        JButton button = new JButton("Click Me");

        // Add logic to the button
        button.addActionListener(e -> label.setText("Button Clicked! Thanks."));

        // Add components to the frame
        add(label);
        add(button);
    }
}
