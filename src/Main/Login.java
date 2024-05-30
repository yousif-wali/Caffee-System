package Main;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

import Main.Util.MyButton;
import Main.Util.MyFrame;
import Main.Util.MyLabel;
import Main.Util.MyPanel;



public class Login {
    public Login() {
        Font HeaderFont = new Font("Arial", Font.BOLD, 20);
        Font PrimaryFont = new Font("Arial", Font.PLAIN, 16);
        MyFrame myFrame = new MyFrame(500, 600);
        
        MyLabel header = new MyLabel("Welcome To Our Coffee Shop", 0, 0, 500, 100);
        header.setFont(HeaderFont);
        header.setHorizontalAlignment(0);
        
        MyPanel panel = new MyPanel(new Color(0x222333), 100, 150, 300, 150);
        
        MyLabel Username = new MyLabel("Username", 15, 15, 100, 20, Color.white);
        Username.setFont(PrimaryFont);
        panel.add(Username);
        
        JTextField UsernameText = new JTextField(20); 
        panel.add(UsernameText); 
        
        MyLabel Password = new MyLabel("Password", 15, 45, 100, 20, Color.white);
        Password.setFont(PrimaryFont);
        panel.add(Password);
        
        JPasswordField PasswordText = new JPasswordField(20);
        panel.add(PasswordText);

        MyButton login = new MyButton("Login", null, 60, 60, 40, 30, new Functions.Login(UsernameText, PasswordText, myFrame));
        panel.add(login);
        myFrame.add(header);
        myFrame.add(panel);
        myFrame.setIconImage(new ImageIcon("logo.jpg").getImage());
        myFrame.Display();
    }
}
