/*Observa��es: � importante ficar atento para os tipos entradas (virgula ou ponto)
 * E tamb�m a localidade que altera como ser� recebido o valor decimal.*/


import java.util.Locale;
import java.util.Scanner;
public class Lendo_double {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US); // Habilita escrita decimal com ponto na entrada
		Scanner sc = new Scanner(System.in);
		
		double y;
		y = sc.nextDouble(); // Aceita somente digitais com virgula (sem locale)
		System.out.println("Voc� digitou: " + y); // Imprime decimais com ponto
		System.out.printf("Voc� digitou: %.2f%n", y); // Imprime decimais com virgula
		System.out.println(y);
		
		sc.close();
	}

}
