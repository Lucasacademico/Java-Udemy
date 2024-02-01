package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		double total_in_stock = price * quantity;
		
		System.out.println("Product data: " + name + ", $ " + price + ", " + quantity + " units, Total: $ " + total_in_stock);
	
		System.out.println("Enter the number of products to be added in stock");
		int add = sc.nextInt();
		quantity = add + quantity;
		total_in_stock = price * quantity;
		
		System.out.print("Updated data: " + name + ", $ " + price + ", " + quantity + " units, Total: $ " + total_in_stock);
		
		System.out.println("Enter the number of products to be added in stock");
		int remove = sc.nextInt();
		quantity = quantity - remove;
		total_in_stock = price * quantity;
		
		System.out.print("Updated data: " + name + ", $ " + price + ", " + quantity + " units, Total: $ " + total_in_stock);
		
		
		sc.close();
	}
}

