package entities;

public class Product4 {
	public String name = "Lucas";
	public double price = 1000;
	public int quantity = 20;
	
	// Construtores
	public Product4 (String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
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