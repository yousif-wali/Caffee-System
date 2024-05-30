package Models;

public class Item {
	private String Name;
	private double Price;
	private int Amount = 0;
	public Item() {
		
	}
	public Item(String name, double price) {
		this.Name = name;
		this.Price = price;
	}
	public Item(String name, double price, int amount) {
		this.Name = name;
		this.Price = price;
		this.Amount = amount;
	}
	public String[] GetInfo() {
		return new String[] {this.Name, this.Price + "", this.Amount + ""};
	}
	public String GetName() {
		return Name;
	}
	public double GetPrice() {
		return Price;
	}
	public int GetAmount() {
		return Amount;
	}
}
