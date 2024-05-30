package Functions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Main.Main;

public class Login implements ActionListener {
	private JTextField Username;
	private JPasswordField Password;
	private JFrame Frame;
	public Login(JTextField Username, JPasswordField Password, JFrame Frame) {
		this.Username = Username;
		this.Password = Password;
		this.Frame = Frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String username = this.Username.getText();
		String password = new String(this.Password.getPassword());
		System.out.println(username + " " + password);
		if(Frame != null) {
			Frame.dispose();
		}
		new Main();
	}
}
