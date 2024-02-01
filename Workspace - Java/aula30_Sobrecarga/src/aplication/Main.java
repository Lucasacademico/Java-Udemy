package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Main {

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

		Product prod = new Product(name, price, quantity);
		
		System.out.printf("Product data: %s%n", prod.toString());
		
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		prod.AddProduct(quantity);
		
		System.out.printf("Updated data: %s%n", prod.toString());
		
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		prod.RemoveProduct(quantity);
		
		System.out.printf("Updated data: %s%n", prod.toString());
		
		sc.close();
	}

}
