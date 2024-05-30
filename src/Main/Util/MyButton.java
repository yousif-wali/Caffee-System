package Main.Util;

import java.awt.Color;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MyButton extends JButton{
	private static final long serialVersionUID = 1L;
	public MyButton(String text, ImageIcon icon, int x, int y, int width, int height, ActionListener event) {
		this.setText(text);
		this.setIcon(icon);
		this.setBounds(x, y, width, height);
		this.addActionListener(event);
	}
	public MyButton(String text, ImageIcon icon, ActionListener event) {
		this.setText(text);
		this.setIcon(icon);
		this.addActionListener(event);
		this.setHorizontalTextPosition(JButton.CENTER);
		this.setVerticalTextPosition(JButton.BOTTOM);
	}
	public MyButton(String text, ImageIcon icon, ActionListener event, Color bg) {
		this.setText(text);
		this.setIcon(icon);
		this.addActionListener(event);
		this.setHorizontalTextPosition(JButton.CENTER);
		this.setVerticalTextPosition(JButton.BOTTOM);
		this.setBackground(bg);
	}

}
