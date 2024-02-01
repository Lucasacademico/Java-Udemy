package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Product_sem_construtor;


public class Main_sem_construtor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Chamada de classe externa Product
		Product_sem_construtor prod = new Product_sem_construtor();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		prod.name = sc.next();
		System.out.print("Price: ");
		prod.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		prod.quantity = sc.nextInt();
		
		// Printa valores
		System.out.printf("Product data: %s%n", prod.toString());
		
		// Adiciona produto
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		prod.AddProduct(quantity);
		
		// Printa valores atualizado
		System.out.printf("Updated data: %s%n", prod.toString());
		
		// Remove produto
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		prod.RemoveProduct(quantity);
		
		// Printa valores atualizado
		System.out.printf("Updated data: %s%n", prod.toString());
		
		
		
		
		sc.close();
	}

}
