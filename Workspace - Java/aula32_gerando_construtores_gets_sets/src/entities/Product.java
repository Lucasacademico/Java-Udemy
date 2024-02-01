package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	// Construtor gerado com funcionalidade Eclipse
	public Product(String name, double price, int quantity) {
		//super(); // gerado automaticamente - serve caso a classe product seja subclasse, logo pode ser apagada
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	// Gets e Sets gerados com funcionalidade eclipse
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}
	// -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

	// Métodos
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