import java.util.Scanner;
import java.util.Locale;

public class Exercicio3_media_ponderada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double n3 = sc.nextDouble();
			
			double m = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
			
			System.out.println(m);
		}
		
		sc.close();
	}
}
