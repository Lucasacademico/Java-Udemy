package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	/*Métodos*/
	public double totalValueInStock() {
		return quantity * price;
	}
	
	public int addProducts(int quantity) {
		return this.quantity += quantity; //this.quantity é o qtd atributo, o outro é p parâmetro
	}
	
	public int removeProducts(int quantity) {
		return this.quantity -= quantity;
	}
	
	//Sobreposição de métodos existentes
	public String toString() {
		return name + ", $ " 
				+ String.format("%.2f", price)
				+ ", " 
				+ quantity 
				+ " units, Total: $ " 
				+ totalValueInStock();
	}
}
