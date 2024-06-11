import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DarkModeToggleApp {

    private static boolean isDarkMode = false;

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Dark Mode Toggle Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Create a panel to hold the toggle button and other components
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create a toggle button for dark mode
        JToggleButton toggleButton = new JToggleButton("Toggle Dark Mode");
        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isDarkMode = !isDarkMode;
                updateLookAndFeel(isDarkMode);
                SwingUtilities.updateComponentTreeUI(frame);
            }
        });

        // Create some labels and buttons to demonstrate the effect of dark mode
        JLabel label = new JLabel("Welcome to the Dark Mode Toggle Example");
        JButton button1 = new JButton("Sign Up");
        JButton button2 = new JButton("Sign In");

        // Add components to the panel
        panel.add(label);
        panel.add(button1);
        panel.add(button2);
        panel.add(toggleButton);

        // Add the panel to the frame
        frame.add(panel, BorderLayout.CENTER);

        // Set the frame to be visible
        frame.setVisible(true);
    }

    // Method to update the look and feel of the UI components
    private static void updateLookAndFeel(boolean darkMode) {
        try {
            if (darkMode) {
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                UIManager.put("control", new Color(43, 43, 43));
                UIManager.put("info", new Color(43, 43, 43));
                UIManager.put("nimbusBase", new Color(50, 50, 50));
                UIManager.put("nimbusAlertYellow", new Color(248, 187, 0));
                UIManager.put("nimbusDisabledText", new Color(128, 128, 128));
                UIManager.put("nimbusFocus", new Color(115, 164, 209));
                UIManager.put("nimbusGreen", new Color(176, 179, 50));
                UIManager.put("nimbusInfoBlue", new Color(66, 139, 221));
                UIManager.put("nimbusLightBackground", new Color(43, 43, 43));
                UIManager.put("nimbusOrange", new Color(191, 98, 4));
                UIManager.put("nimbusRed", new Color(169, 46, 34));
                UIManager.put("nimbusSelectedText", new Color(255, 255, 255));
                UIManager.put("nimbusSelectionBackground", new Color(104, 93, 156));
                UIManager.put("text", new Color(230, 230, 230));
            } else {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
