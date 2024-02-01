package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	
	// SOBRECARGA É REPETIR UM CONSTRUTOR COM OUTROS MÉTODOS SER FAZERMOS UMA OPERAÇÃO, ISTO É
	// O DEV DECIDIRÁ QUAL CONSTRUTOR INVOCAR, E COMO SERÁ REALIZADA A OPERAÇÃO
	// EX: SE UM CONSTRUTOR TIVER 3 DADOS PARA LER, 3 DADOS DEVERÃO SER LIDOS
	// 		SE APENAS 2 DADOS ESTIVEREM PARA LER, SÓ SERÁ OBRIGATÓRIO LER 2 DADOS.
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
