package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity: ");
		int quantity = sc.nextInt();
		
		Product prod = new Product(name, price, quantity);
		
		prod.setName("Computador"); 
		prod.setPrice(1200.22); 
		System.out.println("Nome atualizado: " + prod.getName()); 
		System.out.println("Preço atualizado: " + prod.getPrice()); 
		System.out.println("Quantidade: : " + prod.getQuantity());
		
		sc.close();
	}
}