package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Product2;

public class Main2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Chamada classe
		Product2 prod = new Product2();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		prod.name = sc.next();
		System.out.print("Price: ");
		prod.price = sc.nextDouble();
		System.out.print("Quantity: ");
		prod.quantity = sc.nextInt();
		
		System.out.println("Product data: " + prod.display());
		
		System.out.print("Enter the number of products to be added in stock: ");
		int add = sc.nextInt();
		prod.addToStock(add);
		System.out.println("Updated data: " + prod.display());
		
		System.out.print("Enter the number of products to be removed in stock: ");
		int remove = sc.nextInt();
		prod.removeToStock(remove);

		System.out.println("Updated data: " + prod.display());
		//System.out.printf("quantidade: %d | preço: %f", prod.quantity, prod.TotalInStock());
		
		sc.close();
	}
}

