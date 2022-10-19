package onlineSale;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class loginPage implements ActionListener{
    JFrame frame= new JFrame();
    JButton loginButton= new JButton("LOGIN");
    JButton resetButton= new JButton("RESET");
    JTextField userIDField= new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("USER ID:");
    JLabel userPasswordLabel= new JLabel("PASSWORD:");
    JLabel messageLabel= new JLabel("This is for testing purpose");


    //creating a copy of login info
    HashMap<String,String> loginCred= new HashMap<String,String>();
    loginpage(HashMap<String,String> login_cred_original){
        loginCred= login_cred_original;

        userIDLabel.setBounds(50, 100, 75, 25);
        userPasswordLabel.setBounds(50, 150, 100, 25);
        messageLabel.setBounds(125, 250, 450, 35);
        messageLabel.setFont(new Font(null,Font.ITALIC,25));

        userIDField.setBounds(125, 100, 200, 25);
        userPasswordField.setBounds(125, 150, 200, 25);

        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);

        loginButton.setBounds(125, 200, 100, 25);
        loginButton.addActionListener(this);

        resetButton.setBounds(225, 200, 100, 25);
        resetButton.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==resetButton) {
            userIDField.setText("");
            userPasswordField.setText("");
        }
        if(e.getSource()==loginButton) {
            String userID = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());
            //system.out.println("this is userID");
            if(loginCred.containsKey(userID) && userID.equals("tutu") ) {

                if(loginCred.get(userID).equals(password)) {
                    messageLabel.setForeground(Color.blue);
                    messageLabel.setText("Login successful");
                    frame.dispose();
                    buyerPage1 homePage = new buyerPage1();
                }
                else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Incorrect password");
                }
            }
            else if(loginCred.containsKey(userID) && userID.equals("mimi")) {

                if(loginCred.get(userID).equals(password)) {
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login successful");
                    frame.dispose();
                    buyerPage1 homePage = new buyerPage1();
                }
                else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Incorrect password");
                }
            }
            else if(loginCred.containsKey(userID) && userID.equals("pepe")) {
                if(loginCred.get(userID).equals(password)) {
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login successful");
                    frame.dispose();
                    sellerPage homePage = new sellerPage();

                }
                else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Incorrect password");
                }

            }

            else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Invalid Username");
            }
        }


    }
}

