package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	/*M�todos*/
	public double totalValueInStock() {
		return quantity * price;
	}
	
	public int addProducts(int quantity) {
		return this.quantity += quantity; //this.quantity � o qtd atributo, o outro � p par�metro
	}
	
	public int removeProducts(int quantity) {
		return this.quantity -= quantity;
	}
	
	//Sobreposi��o de m�todos existentes
	public String toString() {
		return name + ", $ " 
				+ String.format("%.2f", price)
				+ ", " 
				+ quantity 
				+ " units, Total: $ " 
				+ totalValueInStock();
	}
}
