package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Product3;

public class Main3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Não é necessário instanciar objeto, visto que os atributos e métodos
		// da classe são estáticos e públicos, podendo serem acessados diretamente.
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		Product3.name = sc.next();
		System.out.print("Price: ");
		Product3.price = sc.nextDouble();
		System.out.print("Quantity: ");
		Product3.quantity = sc.nextInt();
		
		
		System.out.println("Product data: " + Product3.display());
		
		System.out.print("Enter the number of products to be added in stock: ");
		int add = sc.nextInt();
		Product3.addToStock(add);
		System.out.println("Updated data: " + Product3.display());
		
		System.out.print("Enter the number of products to be removed in stock: ");
		int remove = sc.nextInt();
		Product3.removeToStock(remove);

		System.out.println("Updated data: " + Product3.display());
		//System.out.printf("quantidade: %d | preço: %f", prod.quantity, prod.TotalInStock());
		
		sc.close();
	}
}
