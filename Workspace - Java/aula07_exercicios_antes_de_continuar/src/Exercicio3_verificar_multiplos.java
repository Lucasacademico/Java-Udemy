import java.util.Locale;
import java.util.Scanner;

public class Exercicio3_verificar_multiplos {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x >= y)
			if (x % y == 0)
				System.out.printf("%d é multiplo de %d", x, y); 
			else
				System.out.printf("%d não é multiplo de %d", x, y);
		else
			if (y % x == 0)
				System.out.printf("%d é multiplo de %d", y, x); 
			else
				System.out.printf("%d é não é multiplo de %d", y, x); 
			
		sc.close();
	}
}
