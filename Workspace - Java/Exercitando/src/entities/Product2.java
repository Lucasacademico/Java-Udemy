package entities;

public class Product2 {
	public String name;
	public double price;
	public int quantity;
	
	public final double TotalInStock () {
		return price * quantity;
	}
	
	public final int addToStock (int x) {
		return quantity += x;
	}
	
	public final int removeToStock (int y) {
		return quantity -= y;
	}
	
	public final String display() {
		return name + ", $ " + price + ", " + quantity + " units, Total: $ " + TotalInStock();
	}
	
	
}
