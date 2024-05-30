package Functions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JTextField;

import Models.Item;
import Service.ItemList;
import Service.SelectedCoffee;

public class RemoveItem implements ActionListener{
	private String Name;
	private double Price;
	private int    Amount;
	private JTextField Field;
	public RemoveItem(JTextField field) {
		Field = field;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Name = SelectedCoffee.Current.GetName();
		Price = SelectedCoffee.Current.GetPrice();
		int parsedNumber = Integer.parseInt(Field.getText());
        if(parsedNumber > 0) {
        	this.Amount = parsedNumber;
        }
		if(Remove(Name, Price, Amount)) {
			new RefreshHistory();
			Field.setText("0");
		}
	}
	public static boolean Remove(String name, double price, int amount) {
        boolean itemRemoved = false;
        Iterator<Item> iterator = ItemList.Data.iterator();
        
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.GetName().equals(name) && item.GetPrice() == price && item.GetAmount() == amount) {
                iterator.remove();
                itemRemoved = true;
                break; 
            }
        }
        
        return itemRemoved;
    }
}
