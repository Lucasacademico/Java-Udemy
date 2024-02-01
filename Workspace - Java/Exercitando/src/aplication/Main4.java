package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Product4;

public class Main4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Em caso de construtor na classe, devemos declarar variaveis na Main, não utilizando...
		//...instanciamento
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity: ");
		int quantity = sc.nextInt();
		
		// Chamada de construtor
		Product4 prod = new Product4(name, price, quantity);
		// Instanciado objeto com a chamada da classe, dentro do objeto criado, colocamos parametros
		// Estes parametros recebem os dados obrigatóriamente das variaveis declaradas em Main4.
		
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