package Main.Util;

import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class MyRadioButton extends JRadioButton {
	private static final long serialVersionUID = 1L;
	public MyRadioButton(String text, String ImageName, ActionListener function) {
		this.setText(text);
		Image image = new ImageIcon(getClass().getResource("/Images/"+ImageName)).getImage();
		this.setIcon(new ImageIcon(image.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH)));
		this.setHorizontalTextPosition(JLabel.CENTER);
		this.setVerticalTextPosition(JLabel.BOTTOM);
		this.addActionListener(function);
	}
}
