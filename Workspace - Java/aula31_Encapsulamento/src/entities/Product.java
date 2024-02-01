package entities;

public class Product {
	// Atributos agora s�o PRIVADOS, logo, n�o s�o visiveis na func Main.
	private String name;
	private double price;
	private int quantity;
	
	// Construtores
	
	public Product () {
		// padr�o, sem nada
	}
	
	public Product (String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product (String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	// M�todos GET e SET
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice (double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	// M�todos
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