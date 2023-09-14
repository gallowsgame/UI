import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class RegisterUI extends JFrame {

    private JPanel panel;
    private JButton regisButton;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;

    public RegisterUI() {
        initialize();
        setComponents();
        finalizeUI();
    }

    private void initialize() {
        setTitle("Register");
        setSize(340, 150);
    }

    private void setComponents() {
        panel = new JPanel(new FlowLayout());

        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        confirmPasswordField = new JPasswordField(20);

        regisButton = new JButton("Register");
        regisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open the registration page (Create an instance of RegisterUI)
                new LoginUI();
                // Close the current login page (optional)
                dispose();
            }
        });

        panel.add(new JLabel("Username:"));
        panel.add(usernameField);
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);
        panel.add(new JLabel("Confirm Password:"));
        panel.add(confirmPasswordField);
        panel.add(regisButton);

        add(panel, BorderLayout.CENTER);
    }

    private void finalizeUI() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}