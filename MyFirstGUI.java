import javax.swing.*;

public class MyFirstGUI {

    public static void main(String[] args) {

        // Create the window
        JFrame frame = new JFrame("My First GUI");

        // Create a panel
        JPanel panel = new JPanel();

        // Create components
        JLabel label = new JLabel("Welcome to Java Swing!");

        JButton button = new JButton("PRESS^HERE");

        // Add components to the panel
        panel.add(label);
        panel.add(button);

        // Add panel to the window
        frame.add(panel);

        // Configure the window
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Display the window
        frame.setVisible(true);
    }
}