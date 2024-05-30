package Main;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Functions.AddItem;
import Functions.AmountChanger;
import Functions.Logout;
import Functions.Print;
import Functions.RemoveItem;
import Functions.SelectCoffee;
import Main.Util.MyButton;
import Main.Util.MyFrame;
import Main.Util.MyLabel;
import Main.Util.MyPanel;
import Main.Util.MyRadioButton;
import Models.Item;

public class Main {
	MyLabel SelectedText = null;
	private static MyLabel Total = new MyLabel("<html><h2>$0.00</h2></html>", 1100, 250, 100, 50);
	private static JTable table = null;
	public Main() {
		MyFrame myFrame = new MyFrame(1200, 900);
		
		MyPanel header = new MyPanel(Color.gray, 0, 0, 1200, 300);
		header.setLayout(null);
		
		MyButton logout = new MyButton("Logout", null, 1100, 0, 100, 20, new Logout(myFrame));
		logout.setForeground(Color.red);
		logout.setHorizontalAlignment(SwingConstants.LEFT);
		header.add(logout);
		
		
		
		String[] columnNames = {"Name", "Quantity", "Price"};
		Object[][] data = {};
        table = new JTable(data, columnNames);

        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        table.setColumnSelectionAllowed(false);
        table.setEnabled(false);
		scrollPane.setBounds(0,50,1200,200);
        header.add(scrollPane);
		
        MyLabel welcome = new MyLabel("<html><h1>Welcome to our Coffee Shop</h1></html>", 20,0, 400,50);
        welcome.setVerticalTextPosition(JLabel.TOP);
        header.add(welcome);
        
        header.add(Total);
        
		MyPanel Functions = new MyPanel(Color.white, 405, 305, 1200, 600);
		Functions.setLayout(null);
		
		MyPanel Numpad = new MyPanel(Color.gray, 15, 15, 400, 500);
		Numpad.setLayout(null);
		
		JTextField amount = new JTextField(30);
		amount.setBounds(0, 0, 400, 30);
		amount.setEditable(false);
		Numpad.add(amount);
		
		MyPanel NumberGrid = new MyPanel(Color.gray, 0, 30, 400, 400);
		NumberGrid.setLayout(new GridLayout(4,3, 10, 10));
		
		MyButton[] Numbers = {
			new MyButton("1", null, new AmountChanger(amount, "1")),
			new MyButton("2", null, new AmountChanger(amount, "2")),
			new MyButton("3", null, new AmountChanger(amount, "3")),
			new MyButton("4", null, new AmountChanger(amount, "4")),
			new MyButton("5", null, new AmountChanger(amount, "5")),
			new MyButton("6", null, new AmountChanger(amount, "6")),
			new MyButton("7", null, new AmountChanger(amount, "7")),
			new MyButton("8", null, new AmountChanger(amount, "8")),
			new MyButton("9", null, new AmountChanger(amount, "9")),
			new MyButton("BACK", null, e -> amount.setText(amount.getText().substring(0, amount.getText().length() -1))),
			new MyButton("0", null, new AmountChanger(amount, "0")),
			new MyButton("CLS", null, e -> amount.setText(null))
		};
		
		for(MyButton Number : Numbers) {
			NumberGrid.add(Number);
		}	
		Numpad.add(NumberGrid);
		
		MyPanel SelectedCoffee = new MyPanel(Color.gray, 425, 15, 360, 225);
		SelectedText = new MyLabel("<html><h1>Selected Coffee</h1>", 0, 0, 350, 150);
		SelectedText.setHorizontalTextPosition(JLabel.CENTER);
		SelectedText.setVerticalTextPosition(JLabel.TOP);
		
		SelectedCoffee.add(SelectedText);
		
		MyPanel MainFunction = new MyPanel(Color.gray, 425, 300, 360, 200);
		MainFunction.setLayout(new GridLayout(2, 2, 15, 15));
		MyButton[] crud = {
				new MyButton("Add", null, new AddItem(amount, SelectedText)),
				new MyButton("Remove", null, new RemoveItem(amount)),
				new MyButton("Checkout", null, null, Color.green),
				new MyButton("Print", null, new Print(table))
		};
		for(MyButton btn : crud) {
			MainFunction.add(btn);
		}
		
		
		Functions.add(MainFunction);
		Functions.add(SelectedCoffee);
		Functions.add(Numpad);
		
		MyPanel Operators = new MyPanel(Color.white, 0, 305, 400, 600);
		Operators.setLayout(new GridLayout(3, 3, 25, 25));
		
		MyRadioButton[] selections = {
				new MyRadioButton("$12.99", "Coffee1.jpg", new SelectCoffee(SelectedText, "Coffee1.jpg", new Item("Coffee 1", 12.99))),
				new MyRadioButton("$13.49", "Coffee2.jpg", new SelectCoffee(SelectedText, "Coffee2.jpg", new Item("Coffee 2", 13.49))),
				new MyRadioButton("$15.99", "Coffee3.jpg", new SelectCoffee(SelectedText, "Coffee3.jpg", new Item("Coffee 3", 15.99))),
				new MyRadioButton("$10.99", "Coffee4.jpg", new SelectCoffee(SelectedText, "Coffee4.jpg", new Item("Coffee 4", 10.99))),
				new MyRadioButton("$11.99", "Coffee5.jpg", new SelectCoffee(SelectedText, "Coffee5.jpg", new Item("Coffee 5", 11.99))),		
				new MyRadioButton("$9.99", "Coffee6.jpg", new SelectCoffee(SelectedText, "Coffee6.jpg", new Item("Coffee 6", 9.99)))
		};	
		ButtonGroup group = new ButtonGroup();
		
		for(MyRadioButton selection : selections) {
			group.add(selection);
			Operators.add(selection);
		}
		
		myFrame.add(Operators);
		myFrame.add(Functions);
		myFrame.add(header);	
		myFrame.Display();
	}
	public static MyLabel GetTotal() {
		return Total;
	}
	public static JTable GetTable() {
		return table;
	}
	
}
