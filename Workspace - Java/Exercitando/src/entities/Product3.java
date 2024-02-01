package entities;

public class Product3 {
	public static String name;
	public static double price;
	public static int quantity;
	
	public final static double TotalInStock () {
		return price * quantity;
	}
	
	public final static int addToStock (int x) {
		return quantity += x;
	}
	
	public final static int removeToStock (int y) {
		return quantity -= y;
	}
	
	public final static String display() {
		return name + ", $ " + price + ", " + quantity + " units, Total: $ " + TotalInStock();
	}
	
	
}