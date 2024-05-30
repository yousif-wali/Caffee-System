package Main.Util;
import java.awt.Color;
import javax.swing.JLabel;

public class MyLabel extends JLabel {
	private static final long serialVersionUID = 1L;
	public MyLabel(String title, int x, int y, int width, int height){
		this.setText(title);
		this.setBounds(x, y, width, height);
	}
	
	public MyLabel(String title, int x, int y, int width, int height, Color color){
		this.setText(title);
		this.setBounds(x, y, width, height);
		this.setForeground(color);
	}
}
