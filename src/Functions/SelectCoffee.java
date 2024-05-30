package Functions;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Models.Item;
import Service.SelectedCoffee;

public class SelectCoffee implements ActionListener{
	private JLabel Selected; 
	private String Image;
	private Item Chosen;
	public SelectCoffee(JLabel select, String image, Item current) {
		this.Selected = select;
		this.Image = image;
		this.Chosen = current;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(Selected != null) {
			Image image = new ImageIcon(getClass().getResource("/Images/"+this.Image)).getImage();
			Selected.setIcon(new ImageIcon(image.getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH)));	
			SelectedCoffee.Current = this.Chosen;			
		}
	}
}
