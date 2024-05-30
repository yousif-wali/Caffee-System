package Functions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class AmountChanger implements ActionListener{
	private JTextField Amount;
	private String Changer;
	public AmountChanger(JTextField amount, String changer) {
		this.Amount = amount;
		this.Changer = changer;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(Amount.getText() == "0") {
			Amount.setText(Changer);
		}else {
			Amount.setText(Amount.getText() + Changer);			
		}
	}

}
