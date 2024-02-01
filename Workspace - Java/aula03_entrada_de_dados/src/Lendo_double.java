/*Observações: É importante ficar atento para os tipos entradas (virgula ou ponto)
 * E também a localidade que altera como será recebido o valor decimal.*/


import java.util.Locale;
import java.util.Scanner;
public class Lendo_double {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US); // Habilita escrita decimal com ponto na entrada
		Scanner sc = new Scanner(System.in);
		
		double y;
		y = sc.nextDouble(); // Aceita somente digitais com virgula (sem locale)
		System.out.println("Você digitou: " + y); // Imprime decimais com ponto
		System.out.printf("Você digitou: %.2f%n", y); // Imprime decimais com virgula
		System.out.println(y);
		
		sc.close();
	}

}
