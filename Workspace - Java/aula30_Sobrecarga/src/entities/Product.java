package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	
	// SOBRECARGA � REPETIR UM CONSTRUTOR COM OUTROS M�TODOS SER FAZERMOS UMA OPERA��O, ISTO �
	// O DEV DECIDIR� QUAL CONSTRUTOR INVOCAR, E COMO SER� REALIZADA A OPERA��O
	// EX: SE UM CONSTRUTOR TIVER 3 DADOS PARA LER, 3 DADOS DEVER�O SER LIDOS
	// 		SE APENAS 2 DADOS ESTIVEREM PARA LER, S� SER� OBRIGAT�RIO LER 2 DADOS.
	public Product() { 
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;	
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
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
