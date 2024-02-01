import java.util.Locale;
import java.util.Scanner;

public class Estrutura_while {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int soma = 0;
		while (x != 0) {
			soma = soma + x;
			x = sc.nextInt();	
		}
		System.out.printf("Soma: %d%n", soma);
		
		sc.close();
	}
}
