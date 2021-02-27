package MainPackage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class LoginPage extends Frame
{
    private Label emailLabel;
    private TextField emailField;
    private Label passwordLabel;
    private TextField passwordField;
    private Button loginButton;
    private Label messageLabel;
    public LoginPage(int startX,int startY) {
        this.setLayout(null);

        // adding email field
        emailLabel = new Label("Email");
        emailField = new TextField();
        emailLabel.setBounds(startX,startY,200,20);
        emailField.setBounds(startX,startY+30,200,30);
        emailLabel.setForeground(Color.BLACK);
        emailField.setBackground(Color.WHITE);
        emailField.setForeground(Color.BLACK);
        startY +=70;
        // adding password field
        passwordLabel = new Label("Password");
        passwordField = new TextField();
        passwordLabel.setBounds(startX,startY,200,20);
        passwordField.setBounds(startX,startY+30,200,30);
        passwordLabel.setForeground(Color.BLACK);
        passwordField.setBackground(Color.WHITE);
        passwordField.setForeground(Color.BLACK);

        startY+=70;
        // adding login button
        loginButton = new Button("Login");
        loginButton.setBounds(startX,startY,100,20);
        // adding message label
        messageLabel = new Label("Message");
        messageLabel.setBounds(startX,startY+30,500,20);
        messageLabel.setForeground(Color.BLACK);
        this.add(emailLabel);
        this.add(emailField);
        this.add(passwordLabel);
        this.add(passwordField);
        this.add(loginButton);
        this.add(messageLabel);
        loginButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        login();
                    }
                }
        );

    }
    public void login()
    {
       if(getEmail().equals(""))
       {
           showMessage("Enter Email!",Color.RED);
       }
       else if(getPassword().equals(""))
       {
           showMessage("Enter Password!",Color.RED);
       }
       else
       {
           showMessage("Login Success!!",Color.green);
       }
    }
    private String getEmail()
    {
        return emailField.getText();
    }
    private String getPassword()
    {
        return passwordField.getText();
    }
    private void showMessage(String message,Color color)
    {
        messageLabel.setForeground(color);
        messageLabel.setText(message);
    }

}
public class MainClass {
    public static void main(String[] args) {
        LoginPage page = new LoginPage(100,100);
        page.setSize(500,500);
        page.setVisible(true);
        page.addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );
    }
}
