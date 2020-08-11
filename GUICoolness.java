package guicoolness;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;


/**
 *
 * @author SamyB
 */

public class GUICoolness implements ActionListener {

    
    private static JLabel successful;
    private static JLabel userSlot;
    private static JTextField userWrite;
    private static JLabel passwordLabel;
    private static JPasswordField passwdWrite;
    private static JButton press;

    public static void main(String[] args) {

        JPanel panel = new JPanel();
        JFrame outer = new JFrame();
        outer.setSize(350, 200);
        outer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        outer.add(panel);

        panel.setLayout(null);

        userSlot = new JLabel("User");
        userSlot.setBounds(10, 20, 80, 25);
        panel.add(userSlot);

        userWrite = new JTextField(20);
        userWrite.setBounds(100, 20, 165, 25);
        panel.add(userWrite);

        outer.setVisible(true);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwdWrite = new JPasswordField();
        passwdWrite.setBounds(100, 50, 165, 25);
        panel.add(passwdWrite);

        press = new JButton("Login");
        press.setBounds(10, 80, 80, 25);
        panel.add(press);

        successful = new JLabel("");
        successful.setBounds(10, 110, 300, 25);
        press.addActionListener(new GUICoolness());
        panel.add(successful);

        outer.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userWrite.getText();
        String passwd = passwdWrite.getText();
        System.out.println(user + ", " + passwd);
        
        if (user.equals("Samy") && passwd.equals("Samy123")) {
            successful.setText("Login successful!");
        }
    }

}
