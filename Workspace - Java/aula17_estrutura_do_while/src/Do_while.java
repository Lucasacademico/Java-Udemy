import java.util.Scanner;
import java.util.Locale;

public class Do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		do {
			
			System.out.print("Digite a temperatura em Celsius: ");
			double c = sc.nextDouble();
			double f = ((9*c)/5) + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
			System.out.printf("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);	
		}while (resp == 's' || resp == 'S');
		
		sc.close();
	}
}