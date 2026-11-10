import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFirstGUI2 extends JFrame implements ActionListener {

    // GUI components
    private JLabel label;
    private JButton button;

    // Constructor
    public MyFirstGUI2() {

        // Create components
        label = new JLabel("Hello!");
        button = new JButton("Click Me");

        // Register the listener
        button.addActionListener(this);

        // Create panel
        JPanel panel = new JPanel();

        panel.add(label);
        panel.add(button);

        // Configure window
        add(panel);

        setTitle("Event Handling Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    // Handle button clicks
    @Override
    public void actionPerformed(ActionEvent e) {

        label.setText("Button clicked!");
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            MyFirstGUI gui = new MyFirstGUI();
            gui.setVisible(true);
        });
    }
}