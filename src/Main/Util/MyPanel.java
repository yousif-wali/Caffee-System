package Main.Util;

import java.awt.Color;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	public MyPanel(Color color, int x, int y, int width, int height){
		this.setBackground(color);
		this.setBounds(x, y, width, height);
	}
}
