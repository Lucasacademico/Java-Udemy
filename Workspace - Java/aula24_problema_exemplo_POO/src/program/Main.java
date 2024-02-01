package program;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Chamada de localização e leitor de dados
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Chamada de classe
		Product product = new Product();
		
		// Leitura de dados
		System.out.println("Enter the product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in Stock: ");
		product.quantity = sc.nextInt();
		
		// Imprimindo dados
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt(); // variavel para receber informação do usuário
		product.addProducts(quantity); // quantity será usado como parâmetro 
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be remove in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
	}

}
