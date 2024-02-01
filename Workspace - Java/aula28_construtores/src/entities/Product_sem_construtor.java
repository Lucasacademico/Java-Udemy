package entities;

public class Product_sem_construtor {

	public String name;
	public double price;
	public int quantity;
	//public static int add;
	
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
