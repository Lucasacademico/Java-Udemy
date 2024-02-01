import java.util.Scanner;
import java.util.Locale;

public class Exercicio2_valores_em_intervalos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int x = 0;
		
		int contador_in = 0;
		int contador_out = 0;
		
		for (int i = 0; i < n; i++) {
			x = sc.nextInt();
			if (x >= 10 && x <= 20 ) {
				contador_in = contador_in + 1;
			}
			else {
				contador_out += 1;
			}
		}
		System.out.printf("%d in %n%d out", contador_in, contador_out);
		
		sc.close();
	}
}
