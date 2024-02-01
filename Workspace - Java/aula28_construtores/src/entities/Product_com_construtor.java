package entities;

public class Product_com_construtor {

	public String name;
	public double price;
	public int quantity;
	
	// Construtor com nome da classe
	// Parametros com mesmo nome dos atributos da classe
	public Product_com_construtor(String name, double price, int quantity) {
		// Referenciação de atributos com parametros
		this.name = name;
		this.price = price;
		this.quantity = quantity;	
	}
	
	public final double TotalValueInStock() {
		return quantity * price;
	}
	
	public final int AddProduct (int quantity) {
		return this.quantity += quantity;
	}
	
	public final int RemoveProduct (int quantity) {
		return this.quantity -= quantity;
	}
	
	public final String toString() {
		return name +
				", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ TotalValueInStock();
	}
	
}


