import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginUI extends JFrame {

    // ประกาศ components ต่างๆที่ต้องใช้
    private JPanel panel;
    private JButton loginButton, mainregisButton;
    private JTextField usernameField;
    private JPasswordField passwordField;
    

    // 
    public LoginUI(){
        initial();
        setComponent();
        Finally();
    }

    // set title and size
    public void initial (){
        setTitle("Password Generator");
        setSize(500,200);
    }

    // align all components properly
    public void setComponent(){

        panel = new JPanel(new GridLayout(4,5));

        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");

        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);

        loginButton = new JButton("Login");
        mainregisButton = new JButton("Register");

        mainregisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // เมื่อ click ปุ่ม register จะ popup RegisterUI page
                new RegisterUI();
                
                // ปิดหน้าต่าง LoginUI
                dispose();
            }
        });
        
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); 
        panel.add(loginButton);
        panel.add(new JLabel()); 
        panel.add(mainregisButton);

        add(panel, BorderLayout.CENTER);


    }
    
    // 
    public void Finally (){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }



    
}
