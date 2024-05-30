package Main.Util;

import java.awt.Dimension;

import javax.swing.JTextField;

public class MyTextField extends JTextField{
	private static final long serialVersionUID = 1L;
	public MyTextField(int x, int y, int width, int height) {
		this.setBounds(x, y, width, height);
		this.setPreferredSize(new Dimension(width, height));
	}
}
