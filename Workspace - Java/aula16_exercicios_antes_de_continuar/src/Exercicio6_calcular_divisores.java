import java.util.Scanner;
import java.util.Locale;

public class Exercicio6_calcular_divisores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.printf("%d%n", i);
			}
		}

		sc.close();
	}
}

