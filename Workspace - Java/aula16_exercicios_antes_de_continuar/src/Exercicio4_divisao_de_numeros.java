import java.util.Scanner;
import java.util.Locale;

public class Exercicio4_divisao_de_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			double x = sc.nextInt();
			double y = sc.nextInt();
			double div = x / y;
			
			if (y == 0) {
				System.out.println("Divisão impossível");
			}
			else {
				System.out.printf("%.1f", div);
			}
			
		}
		
		sc.close();
	}
}


