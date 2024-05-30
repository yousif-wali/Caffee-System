package Main.Util;

import javax.swing.JFrame;
public class MyFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	public MyFrame(int width, int heigth){
		this.setTitle("Coffee Shop");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		this.setSize(width, heigth);	
	}
	public void Display() {
		this.setVisible(true);
	}
}
