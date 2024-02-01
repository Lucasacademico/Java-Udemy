
import java.util.Locale;
import java.util.Scanner;
public class Exercicio1_soma_de_dois_valores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double soma = x + y;
		System.out.printf("A soma de %.2f + %.2f é igual à %.2f%n", x, y, soma);
		
		sc.close();
	}

}
