package Functions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Models.Item;
import Service.ItemList;
import Service.SelectedCoffee;

public class AddItem implements ActionListener {
    private int Amount;
    private JLabel Chosen;
    private JTextField reset;

    public AddItem(JTextField amount, JLabel chosen) {
        this.reset  = amount;
        this.Chosen = chosen;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(SelectedCoffee.Current == null) {
                throw new Exception("Error Code:01");
            }
            int parsedNumber = Integer.parseInt(reset.getText());
            if(parsedNumber > 0) {
            	this.Amount = parsedNumber;
            }
            Item tmp = new Item(SelectedCoffee.Current.GetName(), SelectedCoffee.Current.GetPrice(), this.Amount);
            ItemList.Insert(tmp);
            
            SelectedCoffee.Current = null;
            this.reset.setText("0");
            this.Chosen.setIcon(null);
            
            
            new RefreshHistory();
        } catch(Exception error) {
            JOptionPane.showMessageDialog(null, "Please Select a Coffee\n" + error.getMessage(), "Error", JOptionPane.PLAIN_MESSAGE);
        }
    }

}
