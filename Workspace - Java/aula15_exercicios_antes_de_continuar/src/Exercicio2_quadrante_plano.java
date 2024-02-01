import java.util.Locale;
import java.util.Scanner;

public class Exercicio2_quadrante_plano {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
				break;
			}
			
			else if (x > 0 && y < 0) {
				System.out.println("Quarto");
				break;
			}
			
			else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
				break;
			}
			
			else {
				System.out.println("Segundo");
				break;
			}
		}
		
		if (x == 0 || y == 0) {
			System.out.println("Valor nulo");
		} 
		
		System.out.println("Programa finalizado");
					
		sc.close();
	}
}
