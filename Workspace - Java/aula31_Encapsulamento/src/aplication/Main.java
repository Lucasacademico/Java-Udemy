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
		
		// Chamada classe
		Product prod = new Product(name, price, quantity);
		
		prod.setName("Computador"); // alterado o valor com o método SET
		System.out.println("Nome atualizado: " + prod.getName()); // imprimindo nome atualizado
		
		prod.setPrice(1200.22); // alterado o valor com o método SET
		System.out.println("Preço atualizado: " + prod.getPrice()); // imprimindo nome atualizado
		
		// Não foi criado setQuantity, pois é um valor que não pode ser alterado ao BelPrazer, visto
		// que afetaria todo o estoque da empresa.
		System.out.println("Quantidade: : " + prod.getQuantity()); // imprimindo nome atualizado
		
		
		//System.out.println("Product data: " + prod.display());
		
		
		sc.close();
	}
}
