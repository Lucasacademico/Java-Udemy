
import java.util.Scanner;
import java.util.Locale;

public class Exercicio7_verificar_linha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		
		for (int i = 1; i <= n; i++) {
			double quad = Math.pow(i, 2);
			double cubo = Math.pow(i, 3);
			System.out.printf("%d %.0f %.0f%n", i, quad, cubo);
		}
		
		sc.close();
	}
}
